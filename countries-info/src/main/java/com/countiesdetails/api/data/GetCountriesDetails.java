package com.countiesdetails.api.data;

import com.countiesdetails.api.model.Countries;
import com.countiesdetails.api.model.Country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetCountriesDetails {

    private static Map<String, Countries> countriesData;
    private static List<Country> countriesList;

    static {
        countriesData = new HashMap<>();

        Countries countries = new Countries();

        List<Country> countryList=new ArrayList<>();
        Country country1 =new Country();
        country1.setCountryCode("AU");
        country1.setCountryName("Australia");
        country1.setCapital("Canberra");
        country1.setCurrency("Australian Dollar");
        country1.setLanguage("English");
        countryList.add(country1);

        Country country2 =new Country();
        country2.setCountryCode("BD");
        country2.setCountryName("Bangladesh");
        country2.setCapital("Dhaka");
        country2.setCurrency("Taka");
        country2.setLanguage("Bangla,English");
        countryList.add(country2);

        Country country3 =new Country();
        country3.setCountryCode("CA");
        country3.setCountryName("Canada");
        country3.setCapital("Ottawa");
        country3.setCurrency("Canadian Dollar");
        country3.setLanguage("English");
        countryList.add(country3);

        Country country4 =new Country();
        country4.setCountryCode("FR");
        country4.setCountryName("France");
        country4.setCapital("Paris");
        country4.setCurrency("Euro");
        country4.setLanguage("French");
        countryList.add(country4);

        Country country5 =new Country();
        country5.setCountryCode("GR");
        country5.setCountryName("Germany");
        country5.setCapital("Berlin");
        country5.setCurrency("Euro");
        country5.setLanguage("German");
        countryList.add(country5);

        Country country6 =new Country();
        country6.setCountryCode("IN");
        country6.setCountryName("India");
        country6.setCapital("New Delhi");
        country6.setCurrency("Rupees");
        country6.setLanguage("Hindi,English");
        countryList.add(country6);

        Country country7 =new Country();
        country7.setCountryCode("SA");
        country7.setCountryName("South Africa");
        country7.setCapital("Cape Town");
        country7.setCurrency("Rand");
        country7.setLanguage("IsiZulu,IsiXhosa,Afrikaans,English");
        countryList.add(country7);

        Country country8 =new Country();
        country8.setCountryCode("BR");
        country8.setCountryName("Brazil");
        country8.setCapital("Brasilia");
        country8.setCurrency("Real");
        country8.setLanguage("Unknown");
        countryList.add(country8);

        Country country9 =new Country();
        country9.setCountryCode("UK");
        country9.setCountryName("United Kingdom");
        country9.setCapital("London");
        country9.setCurrency("Pound");
        country9.setLanguage("English");
        countryList.add(country9);

        Country country10 =new Country();
        country10.setCountryCode("USA");
        country10.setCountryName("United State America");
        country10.setCapital("Washington");
        country10.setCurrency("Dollar");
        country10.setLanguage("English");
        countryList.add(country10);

        countries.setCountries(countryList);

        countriesData.put("COUNTRIES",countries);

        countriesList=countryList;

    }

    public static Countries getCountries(){
        return countriesData.get("COUNTRIES");
    }

    public static List<Country> getCountriesList(){
        return countriesList;
    }
}
