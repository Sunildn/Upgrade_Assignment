package com.FRS;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger passanger = new Passenger("sunil","8060494949","sunil.dn.sdd@gmail.com",
                "church street","banglore","karnataka");
        System.out.println(passanger.getAddressDetails());
        System.out.println(passanger.getContactDetails());
        System.out.println(passanger.getId());

        Flight flight1 = new Flight("1","jetlag",100,4);
        System.out.println(flight1.getFlightDetails());
        System.out.println(flight1.checkAvailabilityOfSeat());
        RegularTicket rt1= new RegularTicket("278dg","banglore","london","26/7 3.00",
                "26/7 9.00",20,30000.0f,false,"food",flight1,passanger);
        rt1.checkStatus();
        Flight flight2 = flight1;
        System.out.println(passanger.getId());
        TouristTicket tt1 = new TouristTicket("2222","banglore","london","26/7 9",
                        "27/7 7",20,30000.0f,false,"Taj",null, flight2, passanger);

        System.out.println(flight1.getFlightNo());
        flight1.setFlightNo("ad134");
        System.out.println(flight1.getFlightNo());

        System.out.println(rt1.durationOfJourney());
    }
}
