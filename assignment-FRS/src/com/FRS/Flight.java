package com.FRS;

public class Flight {
    private String flightNo;
    private String airlines;
    private int capacity;
    private int noOfSeatsBooked;
    //Parameterised Constructor
    public Flight(String flightNo, String airlines, int capacity, int noOfSeatsBooked) {
        this.flightNo = flightNo;
        this.airlines = airlines;
        this.capacity = capacity;
        this.noOfSeatsBooked = noOfSeatsBooked;
    }
    //Method to get flight details
    public String getFlightDetails() {
        return "Flight No : "+ flightNo+" and "+"Airlines :"+airlines;
    }
    //method to check availability of seat
    public boolean checkAvailabilityOfSeat(){
        boolean x;
        if (noOfSeatsBooked < capacity){
            x = true;
        }else{
            x=false;
        }
        return x;
    }
    //Method to increment no of seats booked
    public void incrementAvailableCounter() {
        this.noOfSeatsBooked++;
        this.capacity -=1;
    }
    // getter and setters for attributes
    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfSeatsBooked() {
        return noOfSeatsBooked;
    }

    public void setNoOfSeatsBooked(int noOfSeatsBooked) {
        this.noOfSeatsBooked = noOfSeatsBooked;
    }
}
