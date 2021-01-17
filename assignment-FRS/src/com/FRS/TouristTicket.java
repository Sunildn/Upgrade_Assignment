package com.FRS;

public class TouristTicket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    int seatNo;
    float price;
    boolean cancelled;
    String  hotelAddress;
    String[] selectedHotelLocation = new String[5];
    int duration;

    public TouristTicket(String pnr, String from, String to,String departureDateTime, String arrivalDateTime, int seatNo,
                         float price,boolean cancelled, String hotelAddress, String[] selectedHotelLocation) {
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
    }
    String getHotelAddress(){

        return hotelAddress;
    }
    String[] getTouristLocation()
    {
        return selectedHotelLocation;

    }
    void addTouristLocation(String location){

        selectedHotelLocation[0]=location;
    }
    void removeTouristLocation(String location){
        for(int i =0; i<0;i++){
            if(selectedHotelLocation[i] == location){
                selectedHotelLocation[i]=null;
            }
        }
    }
    void checkStatus() {
        if (cancelled == true) {
            System.out.println("Ticked is cancelled");
        } else {
            System.out.println("Ticked is Confirmed");
        }
    }
    int durationOfJourney(){

        return duration;
    }
    void cancelTicket(){
        this.cancelled = true;

    }
}
