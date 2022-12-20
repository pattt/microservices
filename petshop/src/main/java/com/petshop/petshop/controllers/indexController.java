package com.petshop.petshop.controllers;

import com.petshop.petshop.DTO.Pat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping("/")
    public Pat getPat() {
        return new Pat("Snejok", "cat");
    }
}
