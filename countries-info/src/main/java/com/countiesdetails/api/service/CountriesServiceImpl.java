package com.countiesdetails.api.service;

import com.countiesdetails.api.data.GetCountriesDetails;
import com.countiesdetails.api.model.Countries;
import com.countiesdetails.api.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountriesServiceImpl implements CountriesService {

    @Override
    public Countries getCountries(String countryCode) {
        if(countryCode !=null){
            List<Country> cl=
            GetCountriesDetails.getCountries().getCountries().stream()
                    .filter(country -> country.getCountryCode().equals(countryCode)).collect(Collectors.toList());
            Countries countries=new Countries();
            countries.setCountries(cl);
            return countries;
        }
        return GetCountriesDetails.getCountries();
    }

    @Override
    public List<Country> getCountryList() {
        return GetCountriesDetails.getCountriesList();
    }
}
