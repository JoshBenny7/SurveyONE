package com.example.survey.controller;

import com.example.survey.entities.User;
import com.example.survey.entities.Topics;
import com.example.survey.entities.Response;
import com.example.survey.repositories.UserRepository;
import com.example.survey.repositories.TopicsRepository;
import com.example.survey.repositories.ResponseRepository;
import com.example.survey.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TopicsRepository topicsRepository;

    @Autowired
    private ResponseRepository responseRepository;

    // Dashboard Home
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<User> users = userRepository.findAll();
        List<Topics> topics = topicsRepository.findAll();
        List<Response> responses = responseRepository.findAll();

        model.addAttribute("users", users);
        model.addAttribute("topics", topics);
        model.addAttribute("responses", responses);

        return "admin/dashboard";
    }

    // Create User
    @PostMapping("/users/add")
    public String addTopic(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/admin/dashboard";
    }

    // Edit User
    @PostMapping("/users/update")
    public String updateUser(@ModelAttribute User updatedUser) {
        Optional<User> userOpt = userRepository.findById(updatedUser.getId());
        userOpt.ifPresent(user -> {
            user.setUsername(updatedUser.getUsername());
            user.setEmail(updatedUser.getEmail());
            user.setRole(updatedUser.getPassword());
            userRepository.save(user);
        });
        return "redirect:/admin/dashboard";
    }

    // Delete User
    @PostMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "redirect:/admin/dashboard";
    }

    // Add Topic
    @PostMapping("/topics/add")
    public String addTopic(@ModelAttribute Topics topic) {
        topicsRepository.save(topic);
        return "redirect:/admin/dashboard";
    }

    // Delete Topic
    @PostMapping("/topics/delete/{id}")
    public String deleteTopic(@PathVariable Long id) {
        topicsRepository.deleteById(id);
        return "redirect:/admin/dashboard";
    }

    // Delete Response
    @PostMapping("/responses/delete/{id}")
    public String deleteResponse(@PathVariable Long id) {
        responseRepository.deleteById(id);
        return "redirect:/admin/dashboard";
    }

}
