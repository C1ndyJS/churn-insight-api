package com.alura.churnnsight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/predict")
public class PredictionController {

@GetMapping
public String prediction(){
        return  "Deposite microservicio";
    }
}
