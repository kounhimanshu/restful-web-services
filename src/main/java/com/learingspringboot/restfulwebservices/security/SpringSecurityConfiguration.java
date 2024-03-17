package com.learingspringboot.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.security.Security;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws
            Exception{

        //1. All request should be authenticaed
        http.authorizeHttpRequests(auth ->
                auth.anyRequest().authenticated());

        //2. if a request not authenticated a web page is shown
        http.httpBasic(withDefaults());

        //3. CSRF >> POST PUT
        http.csrf().disable();


        return http.build();
    }
}
