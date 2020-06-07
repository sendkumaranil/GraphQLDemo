package com.countiesdetails.api.controller;

import com.countiesdetails.api.model.Countries;
import com.countiesdetails.api.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/countries")
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

    @GetMapping("/")
    public ResponseEntity<?> getCountries(@RequestParam(value = "country-code",required = false) String countryCode){
        Countries countries = countriesService.getCountries(countryCode);
        return  ResponseEntity.status(HttpStatus.OK).body(countries);
    }
}
