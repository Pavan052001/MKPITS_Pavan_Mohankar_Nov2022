package com.mkpits.dbconnection.repo.mysql;

import com.mkpits.dbconnection.model.mysql.UserMysql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMysqlRepo extends JpaRepository<UserMysql,Long> {
}
