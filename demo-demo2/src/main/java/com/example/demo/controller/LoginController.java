package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.reopsitory.AccountRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private AccountRepository accRepo;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession session;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("username", "kh1");
        model.addAttribute("password", "123");
        return "login";
    }

    @PostMapping("/login")
    public String checkLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("remember") Optional<String> remember,
            Model model
    ) {

        Account account = accRepo.findByUsernameAndPass(username, password);
        if(account == null){
            model.addAttribute("checkLoi", "username or password sai!");
            model.addAttribute("username", username);
            model.addAttribute("password", password);
            return "login";
        }else{
            session = request.getSession();
            session.setAttribute("acc", account);

            return "redirect:/home";
        }
    }

    @GetMapping("/logout")
    public String logout() {

        return "redirect:/login";
    }
}
