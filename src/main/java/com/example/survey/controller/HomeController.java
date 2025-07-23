package com.example.survey.controller;

import com.example.survey.entities.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(HttpSession session, Model model) {
        User u = (User) session.getAttribute("user");
        System.out.println("Session has user? " + u);
        if (u != null) model.addAttribute("username", u.getUsername());
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // View: templates/login.html
    }

    @GetMapping("/technology")
    public String techPage() {
        return "technology";
    }
    @GetMapping("/health")
    public String healthPage() {
        return "health";
    }
    @GetMapping("/education")
    public String eduPage(){ return "education";}

    @GetMapping("/workplace")
    public String workPage() {
        return "workplace";
    }

    @GetMapping("/society")
    public String societyPage() {
        return "society";
    }

    @GetMapping("/civic")
    public String civicPage() {
        return "civic";
    }

    @GetMapping("/technology/tech1")
    public String techPage1() {
        return "forms/technology/tech1";
    }
    @GetMapping("/technology/tech2")
    public String techPage2() {
        return "forms/technology/tech2";
    }
    @GetMapping("/technology/tech3")
    public String techPage3() {
        return "forms/technology/tech3";
    }
    @GetMapping("/technology/tech4")
    public String techPage4() {
        return "forms/technology/tech4";
    }

    @GetMapping("/health/health1")
    public String healthPage1() {
        return "forms/health/health1";
    }
    @GetMapping("/health/health2")
    public String healthPage2() {
        return "forms/health/health2";
    }
    @GetMapping("/health/health3")
    public String healthPage3() {
        return "forms/health/health3";
    }
    @GetMapping("/health/health4")
    public String healthPage4() {
        return "forms/health/health4";
    }

    @GetMapping("/education/edu1")
    public String eduPage1(){ return "forms/education/edu1";}
    @GetMapping("/education/edu2")
    public String eduPage2(){ return "forms/education/edu2";}
    @GetMapping("/education/edu3")
    public String eduPage3(){ return "forms/education/edu3";}
    @GetMapping("/education/edu4")
    public String eduPage4(){ return "forms/education/edu4";}

    @GetMapping("/workplace/work1")
    public String workPage1() {
        return "forms/workplace/work1";
    }
    @GetMapping("/workplace/work2")
    public String workPage2() {
        return "forms/workplace/work2";
    }
    @GetMapping("/workplace/work3")
    public String workPage3() {
        return "forms/workplace/work3";
    }
    @GetMapping("/workplace/work4")
    public String workPage4() {
        return "forms/workplace/work4";
    }


    @GetMapping("/society/soc1")
    public String socPage1() {
        return "forms/society/soc1";
    }
    @GetMapping("/society/soc2")
    public String socPage2() {
        return "forms/society/soc2";
    }
    @GetMapping("/society/soc3")
    public String socPage3() {
        return "forms/society/soc3";
    }
    @GetMapping("/society/soc4")
    public String socPage4() {
        return "forms/society/soc4";
    }

    @GetMapping("/civic/civic1")
    public String civicPage1() {
        return "forms/civic/civic1";
    }
    @GetMapping("/civic/civic2")
    public String civicPage2() {
        return "forms/civic/civic2";
    }
    @GetMapping("/civic/civic3")
    public String civicPage3() {
        return "forms/civic/civic3";
    }
    @GetMapping("/civic/civic4")
    public String civicPage4() {
        return "forms/civic/civic4";
    }
}


