package edu.amadeus.sdk;




public class FlightAvailabilities {

    public static void main(String[] args) {//throws ResponseException {

       /* Amadeus amadeus = Amadeus.builder(
                System.getenv()).build();

        String body = "{\"originDestinations\":[{\"id\":\"1\",\"originLocationCode\":\"ATH\",\"destinationLocationCode\":\"SKG\",\"departureDateTime\":{\"date\":\"2023-08-14\",\"time\":\"21:15:00\"}}],\"travelers\":[{\"id\":\"1\",\"travelerType\":\"ADULT\"}],\"sources\":[\"GDS\"]}";

        FlightAvailability[] flightAvailabilities = amadeus.shopping.availability.flightAvailabilities.post(body);

        for(FlightAvailability fa : flightAvailabilities){
            if (fa.getResponse().getStatusCode() != 200) {
                System.out.println("Wrong status code for Flight Inspiration Search: " + fa.getResponse().getStatusCode());
                //System.exit(-1);
            }
            System.out.println(fa);
        }*/
    }

}
