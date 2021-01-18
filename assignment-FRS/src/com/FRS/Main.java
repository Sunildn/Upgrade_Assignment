package com.FRS;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Flight object creation
        //Due to Aggregation Relationship, Flight object formed outside Ticket class object.
        Flight flight  = new Flight("4561","Jet",120,100);
        System.out.println(flight);

        //Passenger object creation
        //Due to Aggregation Relationship, Passenger object formed outside Ticket class object.
        Passenger p1 = new Passenger("Shrink","9874563210",
                "Shashank@gmail.com","Old Street","Mumbai","Maharashtra");
        System.out.println(p1.getContactDetails());

        //Passenger object creation
        //Due to Aggregation Relationship, Passenger object formed outside Ticket class object.
        Passenger p2 = new Passenger( "Biswa","852431790"
                ,"biswap7@yahoo.com","Malabar Street" , "Kolkata","WB");

        //RegularTicket object creation
        RegularTicket regTicket = new RegularTicket("1","Delhi","Mumbai","29/11/20,6",
                "29/11/20,10",10, 45000.00F,false,"food,water,snacks",flight,p1);

        //TouristTicket object creation
        TouristTicket tourTicket = new TouristTicket("2","Delhi" , "Mumbai","29/11/20,6 ",
                "29/11/20,10",21,56000.00f,false,"Hotel Vue,Beach Ave,Mumbai",null,flight,p2);

        printTicketDetails(regTicket);
        printTicketDetails(tourTicket);
        System.out.println(regTicket.durationOfJourney());

        
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
