package com.FRS;
//inheritance of Ticket class to RegularTicket class using extend keyword
public class RegularTicket extends Ticket {
    private String specialService;
    // Parameterised constructor
    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                         int seatNo, float price, boolean cancelled, String specialServices, Flight flight, Passenger passenger) {
     // super to call Parent contsructor
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
        this.specialService = specialServices;

    }
    //Method to check passenger requires any service
    public String getSpecialServices() {
        return specialService;
    }
    //Method to update special services
    public void updateSpecialServices(String service){
        this.specialService= service;
    }
    //getter and setters for private attributes
    public String getSpecialService() {
        return specialService;
    }
    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
}
