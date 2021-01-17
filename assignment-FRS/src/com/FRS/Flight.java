package com.FRS;

public class Flight {
    String flightNo;
    String airlines;
    int capacity;
    int noOfSeatsBooked;
    String getFlightDetails(){
        return "Flight No : "+ flightNo+" and "+"Airlines :"+airlines;
    }
    boolean checkAvailabilityOfSeat(){boolean x;
        if (noOfSeatsBooked < capacity){
            x = true;
        }else{
            x=false;
        }
        return x;
    }
    void incrementAvailableCounter(){
        noOfSeatsBooked +=noOfSeatsBooked;
    }

    public Flight(String flightNo, String airlines, int capacity, int noOfSeatsBooked) {
        this.flightNo = flightNo;
        this.airlines = airlines;
        this.capacity = capacity;
        this.noOfSeatsBooked = noOfSeatsBooked;
    }
    public  Flight(Flight flight){
        this.flightNo = flight.flightNo;
        this.airlines = flight.airlines;
        this.capacity = flight.capacity;
        this.noOfSeatsBooked = flight.noOfSeatsBooked;
    }
}
