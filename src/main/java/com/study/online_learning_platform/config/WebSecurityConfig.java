package com.study.online_learning_platform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig {
    private JwtTokenFilter jwtTokenFilter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .cors(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class)
                .authorizeHttpRequests(request -> request

                        .requestMatchers("/courses/all").permitAll()
                        .requestMatchers("/courses/**").permitAll()
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/register").permitAll()
                        .requestMatchers("/verifyToken").permitAll()

                        .requestMatchers("/courses/create").hasRole("instructor".toUpperCase())
                        .requestMatchers("/courses/update").hasRole("instructor".toUpperCase())
                        .requestMatchers("/courses/delete").hasRole("instructor".toUpperCase())

                        .requestMatchers("/users/create").hasRole("admin".toUpperCase())
                        .requestMatchers("/users/update").hasRole("admin".toUpperCase())
                        .requestMatchers("/users/delete").hasRole("admin".toUpperCase())

                        .anyRequest().authenticated())
                .build();
        // .oauth2ResourceServer(oauth2 ->
        // oauth2.jwt(
        // jwt ->
        // jwt.decoder(jwtDecoder()))).build();
    }

//    @Bean
//    JwtDecoder jwtDecoder() {
//        SecretKeySpec secretKeySpec = new SecretKeySpec(authTokenFilter.secretKey.getBytes(), "HS512");
//        return NimbusJwtDecoder.withSecretKey(secretKeySpec).macAlgorithm(MacAlgorithm.HS512).build();
//    }

//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
