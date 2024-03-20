package com.felipe.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/")
public class OlaController {

    @GetMapping
    public String getMethod() {
        return "Olá Spring Boot!";
    }

    @PostMapping
    public String postMethod(@RequestBody String body) {        
        return body;
    }

    @PutMapping("/{id}")
    public String putMethod(@PathVariable String id, @RequestBody String body) {
        return body + id;
    }

    @DeleteMapping("/{id}")
    public String deleteMethod(@PathVariable String id) {
        return "Deletado id: " + id;
    }
    
}
