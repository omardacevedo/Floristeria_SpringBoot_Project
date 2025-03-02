package com.flores.v1.controller;

import com.flores.v1.Service.FlowerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FlowerController {

    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService){
        this.flowerService= flowerService;
    }

    @GetMapping("/flowers")
    public String getAllFlowers(Model model) {
        model.addAttribute("flowers",flowerService.getAllFlowers());
        return "flowers";
    }
    


    
}
