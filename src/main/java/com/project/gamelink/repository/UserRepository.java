package com.project.gamelink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.project.gamelink.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value="select * from user where email = :email and password = :password", nativeQuery = true) // comando de verificação no bd 
    public User Login(String email, String password);  

    User findByEmail(String email);

    <Entity extends User> Entity save(Entity entity);
}
