package com.mkpits.dbconnection.repo.h2;

import com.mkpits.dbconnection.model.h2.UserH2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserH2Repo extends JpaRepository<UserH2,Long> {
}
