package edu.amadeus.sdk;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Airline;

public class AirlineCodeLookup {

    public static void main(String[] args) throws ResponseException {

        Amadeus amadeus = Amadeus.builder(
                System.getenv()).build();

        Airline[] airlines = amadeus.referenceData.airlines.get(
                Params.with("airlineCodes", "AI")
        );


        for(Airline airline : airlines){
            if (airline.getResponse().getStatusCode() != 200) {
                System.out.println("Wrong status code: " + airline.getResponse().getStatusCode());
                //System.exit(-1);
            }
            System.out.println(airline);
        }
    }
}
