package com.FRS;

public class Passenger {
    private int id;
    //Composition relationship between Address and Passenger classes
    private Address address;
    //Composition relationship between Contact and Passenger classes
    private Contact contact;
    static int idCounter;
    //parameterized Constructor
    public Passenger(String name, String phone, String emailId, String street, String city, String state) {
        this.id = ++idCounter;
        //Composition relationship between Address and Passenger classes
        // Address object created inside Passenger object
        this.address = new Address(street,city,state);
        //Composition relationship between Contact and Passenger classes
        //Contact object created inside Passenger object
        this.contact = new Contact(name,phone,emailId);
    }
    //Nested Class Contact class nested inside Passenger class
    private static class Contact {
        String name;
        String phone;
        String emailId;
      //Parameterised Constructor
        public Contact(String name, String phone, String emailId) {
            this.name = name;
            this.phone = phone;
            this.emailId = emailId;
        }
        //Method to get contact details
        public String getContactDetails(){
            return  name + ", " + phone + ", " + emailId;
        }
        //Method to update contact details
        public void updateContactDetails(String name,String phone,String emailId){
            this.name= name;
            this.phone= phone;
            this.emailId=emailId;
        }
    }
    //Nested class Address class inside Passenger class
    private static class Address {
        String street;
        String city;
        String state;
        // Parameterised constructor
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
        //method to get address details
        String getAddressDetails() {
            return street + ", " + city + ", " + state;
        }
        //method to update address details
        public void updateAddressDetails(String street, String city, String state){
            this.street =street;
            this.city = city;
            this.state = state;
        }
    }
    // Method to get contact details
    public String getContactDetails(){
        return  contact.name + ", " + contact.phone + ", " + contact.emailId;
    }
    //method to get address details
    String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }
    // Static initializer
    static {
        idCounter = 0;
    }
    //method to get total no of passengers
    public int getPassengerCount(){
        return idCounter;
    }
    // getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Contact getContact() {
        return contact;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }
}