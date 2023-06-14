package com.prueba.croydon.controller;


import com.prueba.croydon.entity.CharacteresDto;
import com.prueba.croydon.model.ResponseModel;
import com.prueba.croydon.service.impl.CharacteresServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/characters")
@CrossOrigin("*")
public class CharacteresController {

    @Autowired
    private CharacteresServiceImpl service;

    @PostMapping(value = "/save")
    public ResponseEntity<Object> save(@RequestBody CharacteresDto dto) {
        ResponseModel response = service.save(dto);
        HttpStatus httpStatus = null;
        switch (response.getStatusCode()) {
            case 201:
                httpStatus = HttpStatus.OK;
                break;
            case 204:
                httpStatus = HttpStatus.NO_CONTENT;
                break;
            default:
                httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
                break;
        }
        return new ResponseEntity<>(response, httpStatus);
    }

    @PutMapping(value = "/edit")
    public ResponseEntity<Object> edit(@RequestBody CharacteresDto dto) {
        ResponseModel response = service.edit(dto);
        HttpStatus httpStatus = null;
        switch (response.getStatusCode()) {
            case 201:
                httpStatus = HttpStatus.OK;
                break;
            case 204:
                httpStatus = HttpStatus.NO_CONTENT;
                break;
            default:
                httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
                break;
        }
        return new ResponseEntity<>(response, httpStatus);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Object>  delete(@PathVariable Integer id){
        ResponseModel response = service.delete(id);
        HttpStatus httpStatus = null;
        switch (response.getStatusCode()) {
            case 201:
                httpStatus = HttpStatus.OK;
                break;
            case 204:
                httpStatus = HttpStatus.NO_CONTENT;
                break;
            default:
                httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
                break;
        }
        return new ResponseEntity<>(response, httpStatus);
        }

    @GetMapping(value = "/list")
    public ResponseEntity<Object> list() {
        ResponseModel response = service.getAll();
        HttpStatus httpStatus = null;
        switch (response.getStatusCode()) {
            case 201:
                httpStatus = HttpStatus.OK;
                break;
            case 204:
                httpStatus = HttpStatus.NO_CONTENT;
                break;
            default:
                httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
                break;
        }
        return new ResponseEntity<>(response, httpStatus);
    }

    @GetMapping(value = "/findById/{id}")
    public ResponseEntity<Object> findById(@PathVariable Integer id) {
        ResponseModel response = service.findById(id);
        HttpStatus httpStatus = null;
        switch (response.getStatusCode()) {
            case 201:
                httpStatus = HttpStatus.OK;
                break;
            case 204:
                httpStatus = HttpStatus.NO_CONTENT;
                break;
            default:
                httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
                break;
        }
        return new ResponseEntity<>(response, httpStatus);
    }
    }


