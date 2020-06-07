package com.countiesdetails.api.service;

import com.countiesdetails.api.model.Countries;
import com.countiesdetails.api.model.Country;

import java.util.List;

public interface CountriesService {

    public Countries getCountries(String countryCode);
    public List<Country> getCountryList();
}
