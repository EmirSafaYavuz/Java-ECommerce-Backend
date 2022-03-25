package com.emirsafayavuz.northwind.core.dataAccess;

import com.emirsafayavuz.northwind.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User getByEmail(String email);
}
