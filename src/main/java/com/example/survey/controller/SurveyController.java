package com.example.survey.controller;

import com.example.survey.entities.Response;
import com.example.survey.entities.User;
import com.example.survey.repositories.ResponseRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SurveyController {

    private final ResponseRepository responseRepository;

    public SurveyController(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    @PostMapping("/submit-response")
    public String submitResponse(@ModelAttribute Response response, HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login"; // User not logged in
        }

        response.setUsername(user.getUsername());
        responseRepository.save(response);
        return "redirect:/";
    }
}
