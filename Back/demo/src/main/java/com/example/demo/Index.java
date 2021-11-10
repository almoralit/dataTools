package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    
    @RequestMapping("/")
    public String index(){
        return "Index de la API de afiliación de vehículos";
    }
}
