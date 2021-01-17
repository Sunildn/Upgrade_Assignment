package com.FRS;

public class RegularTicket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    int seatNo;
    float price;
    boolean cancelled;
    String specialServices;
    int duration;

    public RegularTicket(String pnr, String from, String to,String departureDateTime, String arrivalDateTime,
                         int seatNo, float price,boolean cancelled, String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
    }
    String getSpecialServices(){
        return "food,water and snakes";
    }
    void updateSpecialServices(String service){
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
    void cancelTicket() {
        this.cancelled = true;

    }

}
