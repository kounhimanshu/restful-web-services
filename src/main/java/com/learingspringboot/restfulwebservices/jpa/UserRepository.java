package com.learingspringboot.restfulwebservices.jpa;

import com.learingspringboot.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
