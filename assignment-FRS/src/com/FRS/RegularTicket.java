package com.FRS;

public class RegularTicket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private int seatNo;
    private float price;
    private boolean cancelled;
    private String specialServices;
    private int duration;
    private Flight flight;
    private Passenger passenger;

    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                         int seatNo, float price, boolean cancelled, String specialServices, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
        this.flight = flight;
        this.passenger = passenger;
    }
    public String getSpecialServices(){
        return "food,water and snakes";
    }
    void updateSpecialServices(String service){
    }
    public void checkStatus() {
        if (cancelled == true) {
            System.out.println("Ticked is cancelled");
        } else {
            System.out.println("Ticked is Confirmed");
        }
    }
    public int durationOfJourney(){

        return duration;
    }
    public void cancelTicket() {
        this.cancelled = true;

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
}
