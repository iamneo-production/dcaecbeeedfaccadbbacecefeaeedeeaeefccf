package com.example.springapp.Controllers;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ApiController {
    String Welcome()
    {
        return "Welcome String Boot!";
    }
}
