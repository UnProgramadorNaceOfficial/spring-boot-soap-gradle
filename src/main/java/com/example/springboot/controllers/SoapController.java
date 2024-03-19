package com.example.springboot.controllers;

import com.example.springboot.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SoapController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping("/listAllContinents")
    public ResponseEntity<?> listAllContinents(){
        return ResponseEntity.ok(soapClient.getAllContinents());
    }

    @GetMapping("/listAllCountries")
    public ResponseEntity<?> listAllCountries(){
        return ResponseEntity.ok(soapClient.getAllCountries());
    }

    @GetMapping("/listCurrencyByName")
    public ResponseEntity<?> listAllCurrencies(){
        return ResponseEntity.ok(soapClient.getAllCurrenciesByName());
    }

    @GetMapping("/getCurrencyByName/{code}")
    public ResponseEntity<?> getCurrencyByName(@PathVariable String code){
        return ResponseEntity.ok(soapClient.getCurrencyByName(code.toUpperCase()));
    }

    @GetMapping("/findCountry/{code}")
    public ResponseEntity<?> findCountry(@PathVariable String code){
        return ResponseEntity.ok(soapClient.findCountry(code.toUpperCase()));
    }
}
