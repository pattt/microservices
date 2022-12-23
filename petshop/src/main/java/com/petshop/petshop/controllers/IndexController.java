package com.petshop.petshop.controllers;

import com.petshop.petshop.DTO.Pat;
import com.petshop.petshop.services.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {

    private final AnimalService animalService;
    @GetMapping("/")
    public Pat getPat() {
        String resp = animalService.getHello("cat");
        return new Pat("Snejok", resp);
    }
}
