package com.FRS;

public class TouristTicket {
   private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private int seatNo;
    private float price;
    private boolean cancelled;
    private String  hotelAddress;
    private String[] selectedHotelLocation = new String[5];
    private int duration;
    private Flight flight;
    private Passenger passenger;

    public TouristTicket(String pnr, String from, String to,String departureDateTime, String arrivalDateTime, int seatNo,
                         float price,boolean cancelled, String hotelAddress, String[] selectedHotelLocation,Flight flight,Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.selectedHotelLocation = selectedHotelLocation;
        this.flight = flight;
        this.passenger = passenger;

    }
    public String getHotelAddress(){

        return hotelAddress;
    }
    public String[] getTouristLocation()
    {
        return selectedHotelLocation;

    }
    public void addTouristLocation(String location){

        selectedHotelLocation[0]=location;
    }
    public void removeTouristLocation(String location){
        for(int i =0; i<0;i++){
            if(selectedHotelLocation[i] == location){
                selectedHotelLocation[i]=null;
            }
        }
    }
    public void checkStatus() {
        if (cancelled == true) {
            System.out.println("Ticked is cancelled");
        } else {
            System.out.println("Ticked is Confirmed");
        }
    }
    int durationOfJourney(){

        return duration;
    }
    public void cancelTicket(){
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
