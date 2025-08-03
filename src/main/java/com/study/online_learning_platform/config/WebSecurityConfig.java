package com.study.online_learning_platform.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@AllArgsConstructor
public class WebSecurityConfig {
    //    @Value("${apiCourse}")
//    private String courseApi;
//    @Value("${apiUser}")
//    String userApi;
//    @Autowired
    private final AuthTokenFilter authTokenFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .cors(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .addFilterBefore(authTokenFilter, UsernamePasswordAuthenticationFilter.class)
                .authorizeHttpRequests(
                        request -> request
                                .requestMatchers("courses/all","login","register","courses/**").permitAll()
                                .requestMatchers("course/create").hasRole("instructor".toUpperCase())
                                .requestMatchers("course/update").hasRole("instructor".toUpperCase())
                                .requestMatchers("course/delete").hasRole("instructor".toUpperCase())
                                .requestMatchers("/users/create").hasRole("admin".toUpperCase())
                                .requestMatchers("/users/update").hasRole("admin".toUpperCase())
                                .requestMatchers("/users/delete").hasRole("admin".toUpperCase())
                                .anyRequest().authenticated()
                )
                .build();
    }

}
