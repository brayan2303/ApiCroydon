package com.prueba.croydon.controller;

import com.prueba.croydon.entity.GetNameDto;
import com.prueba.croydon.entity.GetNameIdDto;
import com.prueba.croydon.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ApiController {

    @Autowired
    private ApiService service;

    @GetMapping(value = "/getCharacter/{name}")
    public GetNameDto getCharacterByName(@PathVariable String name) {
        return service.getCharacterByName(name);
    }

    @GetMapping(value = "/getCharacterId/{id}")
    public GetNameIdDto getCharacterById(@PathVariable Integer id) {
        return service.getCharacterById(id);
    }
}
