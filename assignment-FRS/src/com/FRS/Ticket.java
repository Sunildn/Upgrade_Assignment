package com.FRS;

public class Ticket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    int duration;
    int seatNo;
    float price;
    boolean cancelled;

    void checkStatus() {
        if (cancelled== true) {
            System.out.println("Ticked is cancelled");
        } else {
            System.out.println("Ticked is Confirmed");
        }
    }

    int durationOfJourney() {
        return duration;
    }

    void cancelTicket() {
        this.cancelled = true;
    }

}


