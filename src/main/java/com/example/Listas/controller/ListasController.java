package com.example.Listas.controller;

import com.example.Listas.service.ListasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/numeros" )
public class ListasController {

    private final ListasService validarNumeros;
    public ListasController(@Autowired ListasService x) {
        this.validarNumeros = x;
    }
    @PostMapping
    public ResponseEntity<List<Integer>> solucionSerie(@RequestBody ListasRequest request){
        return ResponseEntity.ok(validarNumeros.hallarNumeros(request));
    }
}
