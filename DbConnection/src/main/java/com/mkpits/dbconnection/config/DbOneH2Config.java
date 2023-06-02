package com.mkpits.dbconnection.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
    entityManagerFactoryRef = "db1EntityManagerFactory",
        transactionManagerRef = "db1TransactionManager",
        basePackages = "com.mkpits.dbconnection.repo.h2"
)
public class DbOneH2Config {
     @Value("${spring.db1.datasource.url}")
     private String dbUrl;

     @Value("${spring.db1.datasource.username}")
     private String username;

     @Value("${spring.db1.datasource.password}")
     private String password;

     @Value("${spring.db1.datasource.driverClassName}")
     private  String driverClassName;
    // Datasource #Bean 1
    @Primary
   @Bean
   @ConfigurationProperties(prefix = "spring.db1.datasource")
    public DataSource db1Datasource(){

        return DataSourceBuilder.create()
                .url(dbUrl)
                .driverClassName(driverClassName)
                .username(username)
                .password(password)
                .build();
    }
    // Entity Manager Factory #Bean 2
    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean db1EntityManagerFactory(EntityManagerFactoryBuilder emfb){
        HashMap<String,Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto","create");
        properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
       return emfb.dataSource(db1Datasource())
               .packages("com.mkpits.dbconnection.model.h2")
               .properties(properties)
               .build();
    }

    // Transaction Manager #Bean 3
    @Primary
    @Bean
    public PlatformTransactionManager db1TransactionManager(
          @Qualifier("db1EntityManagerFactory")
          EntityManagerFactory entityManagerFactory) {

       return new JpaTransactionManager(entityManagerFactory);
    }
}
