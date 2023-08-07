package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.reopsitory.CategoryRepository;
import com.example.demo.reopsitory.ProductRepositry;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductRepositry productRepositry;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("home")
    public String home(Model model){
        List<Product> lstProduct = productRepositry.findAll();
        List<Category> lstCategory = categoryRepository.findAll();

        model.addAttribute("lstProduct", lstProduct);
        model.addAttribute("lstCategory", lstCategory);

        return "home";
    }
}
