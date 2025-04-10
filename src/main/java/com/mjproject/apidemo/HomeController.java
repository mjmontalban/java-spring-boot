package com.mjproject.apidemo;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {

    @RequestMapping("/")
    
    public String index() {
       return "index.html";
    }
}
