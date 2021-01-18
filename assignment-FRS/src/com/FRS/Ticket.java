package com.FRS;
//Ticket class is defined abstract class
public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private int seatNo;
    private float price;
    private boolean cancelled;
    private int duration;
    //Aggregation relationship between Flight class and Ticket class
    private Flight flight;
    //Aggregation relationship between Passenger class and Ticket class
    private Passenger passenger;
    // Parameterised constructor;
    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                  int seatNo, float price, boolean cancelled, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }//Method to check status of Ticket
    void checkStatus() {
        if (cancelled) {
            System.out.println("Ticked is cancelled");
        } else {
            System.out.println("Ticked is Confirmed");
        }
    }
    //Method to return duration of journey
    public int durationOfJourney() {
        String str1[] = departureDateTime.split(",");
        int t1 = Integer.parseInt(str1[1]);
        String  str2[]=arrivalDateTime.split(",");
        int t2 =Integer.parseInt(str2[1]);
        duration=t2-t1;
       return duration;
    }
    //Method to cancel the ticket
    public void cancelTicket() {
        this.cancelled = true;
    }
    // getter and setters
    public String getPnr() {
        return pnr;
    }
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getDepartureDateTime() {
        return departureDateTime;
    }
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public boolean isCancelled() {
        return cancelled;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }


}


