package com.FRS;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passanger passanger = new Passanger(1,"sunil","8060494949","sunil.dn.sdd@gmail.com",
                "church street","banglore","karnataka");
        System.out.println(passanger.name);
        System.out.println(passanger.getAddressDetails());
        System.out.println(passanger.getContactDetails());
        Flight flight1 = new Flight("1","jetlag",100,4);
        System.out.println(flight1.getFlightDetails());
        flight1.airlines = "blue airlines";
        flight1.flightNo ="2";
        System.out.println(flight1.getFlightDetails());
        System.out.println(flight1.checkAvailabilityOfSeat());
        RegularTicket rt1= new RegularTicket("1122","banglore","london","26/7 9.00",
                "27/7 7.00",20,30000.0f,false,"food");
        rt1.checkStatus();
        passanger.name = "bsbu";
        System.out.println(passanger.getContactDetails());
        TouristTicket tt1 = new TouristTicket("1122","banglore","london","26/7 9.00",
                "27/7 7.00",20,30000.0f,false,"Taj",null);
        System.out.println(tt1.from);
    }
}
