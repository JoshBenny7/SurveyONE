package com.example.survey.config;

import com.example.survey.entities.User;
import com.example.survey.repositories.UserRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication)
            throws IOException, ServletException {

        String username = authentication.getName();
        Optional<User> userOpt = userRepository.findByUsername(username);

        userOpt.ifPresent(user -> request.getSession().setAttribute("user", user));

        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());

        if (roles.contains("ROLE_ADMIN")) {
            response.sendRedirect(request.getContextPath() + "/admin/dashboard");
        } else if (roles.contains("ROLE_USER")) {
            response.sendRedirect(request.getContextPath() + "/index");
        } else {
            // If no role matches, logout and redirect to log in
            request.getSession().invalidate();
            response.sendRedirect(request.getContextPath() + "/login?error=unauthorized");
        }
    }
}
