package com.mkpits.dbconnection.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "db2EntityManagerFactory",
        transactionManagerRef = "db2TransactionManager",
        basePackages = "com.mkpits.dbconnection.repo.mysql"
)
public class DbTwoMysqlConfig {

    // Datasource #Bean 1
    @Value("${spring.db2.datasource.url}")
    private String dbUrl;
    @Value("${spring.db2.datasource.username}")
    private String username;

    @Value("${spring.db2.datasource.password}")
    private String password;

    @Value("${spring.db2.datasource.driverClassName}")
    private String driverClassName;
    @Bean
    @ConfigurationProperties(prefix = "spring.db2.datasource")
    public DataSource db2Datasource(){
        return DataSourceBuilder.create()
                .url(dbUrl)
                .driverClassName(driverClassName)
                .username(username)
                .password(password)
                .build();
    }
    // Entity Manager Factory #Bean 2
    @Bean
    public LocalContainerEntityManagerFactoryBean db2EntityManagerFactory(EntityManagerFactoryBuilder emfb){
        HashMap<String,Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto","update");
        properties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        return emfb.dataSource(db2Datasource())
                .packages("com.mkpits.dbconnection.model.mysql")
                .properties(properties)
                .build();
    }

    // Transaction Manager #Bean 3
    @Bean
    public PlatformTransactionManager db2TransactionManager(
            @Qualifier("db2EntityManagerFactory")
            EntityManagerFactory entityManagerFactory) {

        return new JpaTransactionManager(entityManagerFactory);
    }
}
