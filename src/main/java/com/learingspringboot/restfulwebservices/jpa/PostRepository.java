package com.learingspringboot.restfulwebservices.jpa;

import com.learingspringboot.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
