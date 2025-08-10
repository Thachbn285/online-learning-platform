package com.study.online_learning_platform.config;

import com.study.online_learning_platform.api.user.entity.CustomUserDetails;
import com.study.online_learning_platform.api.user.service.impl.CustomUserDetailsService;
import com.study.online_learning_platform.ultils.JwtTokenUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.modelmapper.internal.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Component
public class JwtTokenFilter extends OncePerRequestFilter {
    private final CustomUserDetailsService customUserDetailsService = new CustomUserDetailsService();
    @Autowired
    private JwtTokenUtils jwtTokenUtils ;
    @Value("${jwtSecret}")
    protected String secretKey;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain)
            throws ServletException, IOException {
        try {
            if (isByPassToken(request)) {
                filterChain.doFilter(request, response);
                return;
            }
            String authHeader = request.getHeader("Authorization");
            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authorization header is invalid");
                return;
            }
            String token = authHeader.substring(7);
            String username = jwtTokenUtils.getUsernameFromToken(token);
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                CustomUserDetails userDetails = (CustomUserDetails) customUserDetailsService
                        .loadUserByUsername(username); // Cần có userDetailsService
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
            filterChain.doFilter(request, response);
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authentication Failed");
            e.printStackTrace();
        }
    }

    private boolean isByPassToken(HttpServletRequest request) {
        List<Pair<String, String>> bypassToken = Arrays.asList(
                Pair.of("/courses/all", "GET"),
                Pair.of("/login", "POST"),
                Pair.of("/register", "POST"),
                Pair.of("/verifyToken", "POST"));
        for (Pair<String, String> pair : bypassToken) {
            if (request.getRequestURI().equals(pair.getLeft()) && request.getMethod().equals(pair.getRight())) {
                return true;
            }
        }
        return false;
    }

}
