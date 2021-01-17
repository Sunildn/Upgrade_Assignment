package com.FRS;
//inheritance of Ticket class to TouristTicket class using extend keyword
public class TouristTicket extends Ticket {
    private String  hotelAddress;
    private String[] selectedTouristLocation = new String[5];
    //Parameterised constructor
    public TouristTicket(String pnr, String from, String to,String departureDateTime, String arrivalDateTime, int seatNo,
                         float price,boolean cancelled, String hotelAddress, String[] selectedTouristLocation,Flight flight,Passenger passenger) {
       // super() to call parent constructor
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }
    //Method to get hotel address
    public String getHotelAddress(){
        return this.hotelAddress;
    }
    //Method to get all the tourist locations
    public String[] getTouristLocation() {
        return this.selectedTouristLocation;
    }
    // Method to add another tourist location to list
    public void addTouristLocation(String location) {
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                selectedTouristLocation[i] = location;
            } else {
                this.selectedTouristLocation[0] = location;
            }
        }
    }
    //Method to remove tourist location from list
    public void removeTouristLocation(String location){
        for(int i =0; i<selectedTouristLocation.length;i++){
            if(selectedTouristLocation[i] == location){
                selectedTouristLocation[i]=null;
            }
        }
    }
    // getters and setters
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
}
