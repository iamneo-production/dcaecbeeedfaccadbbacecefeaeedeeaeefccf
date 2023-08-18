package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController package{
@GetMapping("/welcome")
public String welcome() 
    {
        return "Welcome";
    }
}

