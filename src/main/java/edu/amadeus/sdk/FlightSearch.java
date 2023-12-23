package edu.amadeus.sdk;

import com.amadeus.Amadeus;
import com.amadeus.Params;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightDestination;

public class FlightSearch {
    public static void main(String[] args) throws ResponseException {
        Amadeus amadeus = Amadeus.builder(
                System.getenv()).build();

        FlightDestination[] flightDestinations = amadeus.shopping.flightDestinations.get(
                Params.with("origin", "DEL")
        );


        for(FlightDestination fd : flightDestinations){
            if (fd.getResponse().getStatusCode() != 200) {
                System.out.println("Wrong status code for Flight Inspiration Search: " + fd.getResponse().getStatusCode());
                //System.exit(-1);
            }
            System.out.println(fd);
        }

    }
}
