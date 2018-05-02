package it.iseed.account.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import it.iseed.account.entities.User;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, String>{
    //custom
    Optional<User> findById(@Param("id") String id);
}
