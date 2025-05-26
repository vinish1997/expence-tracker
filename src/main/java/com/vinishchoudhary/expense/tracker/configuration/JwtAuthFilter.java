package com.vinishchoudhary.expense.tracker.configuration;

import com.vinishchoudhary.expense.tracker.model.User;
import com.vinishchoudhary.expense.tracker.repository.UserRepository;
import com.vinishchoudhary.expense.tracker.service.UserService;
import com.vinishchoudhary.expense.tracker.utils.JwtUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JwtAuthFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer ")){
            String token = authHeader.substring(7);
            if (jwtUtils.isTokenValid(token)) {
                String email = jwtUtils.extractEmail(token);
                User user = userService.;

            }
        }
    }
}
