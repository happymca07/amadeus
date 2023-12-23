package edu.amadeus.sdk;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.City;

public class CitySearch {

    public static void main(String[] args) throws ResponseException {
        Amadeus amadeus = Amadeus.builder(
                System.getenv()).build();

        City[] cities = amadeus.referenceData.locations.cities.get(
                Params.with("keyword","DELHI")
        );

        for(City city : cities){
            if (city.getResponse().getStatusCode() != 200) {
                System.out.println("Wrong status code: " + city.getResponse().getStatusCode());
                //System.exit(-1);
            }
            System.out.println(city);
        }
    }
}