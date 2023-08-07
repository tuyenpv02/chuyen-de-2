package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.reopsitory.CategoryRepository;
import com.example.demo.reopsitory.ProductRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    private ProductRepositry productRepositry;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/detail/{ma}")
    public String detail(
            Model model,
            @PathVariable("ma")Product product
            ){
        model.addAttribute("productDetail", product);
        return "Detail";
    }

    @GetMapping("san-pham")
    public String index(Model model){
        List<Product> lstProduct = productRepositry.findAll();
        List<Category> lstCategory = categoryRepository.findAll();

        model.addAttribute("lstProduct", lstProduct);
        model.addAttribute("lstCategory", lstCategory);

        return "san_pham";
    }

    @PostMapping("/them-san-pham")
    public String store(
            Product product
    ) {

        System.out.println(product.toString());
        this.productRepositry.save(product);

        return "redirect:/san-pham";
    }
}
