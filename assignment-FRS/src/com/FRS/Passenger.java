package com.FRS;

public class Passenger {
    int id;
    private Address address;
    private Contact contact;
    static int idCounter=0;
    public Passenger(String name, String phone, String emailId, String street, String city, String state) {
        this.id = ++idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,phone,emailId);
    }
    public Passenger(Passenger passenger){
        this.id = ++idCounter;
       this.contact = passenger.contact;;
       this.address = passenger.address;
    }
    public int getPassengerCount(){
        return idCounter;
    }
    public String getContactDetails(){
        return  contact.name + ", " + contact.phone + ", " + contact.emailId;
    }
    String getAddressDetails() {

        return address.street + ", " + address.city + ", " + address.state;
    }

    private static class Contact {
        String name;
        String phone;
        String emailId;
        public String getContactDetails(){
            return  name + ", " + phone + ", " + emailId;
        }
        public void updateContactDetails(String name,String phone,String emailId){
            this.name= name;
            this.phone= phone;
            this.emailId=emailId;
        }
        public Contact(String name, String phone, String emailId) {
            this.name = name;
            this.phone = phone;
            this.emailId = emailId;
        }
        public Contact(Contact contact){
            this.name = contact.name;
            this.phone = contact.phone;
            this.emailId = contact.emailId;
        }
    }
    private static class Address {
        String street;
        String city;
        String state;
        String getAddressDetails() {
            return street + ", " + city + ", " + state;
        }

        public void updateAddressDetails(String street, String city, String state){
            this.street =street;
            this.city = city;
            this.state = state;
        }
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
        public Address(Address address){
            this.street = address.street;
            this.city = address.city;
            this.state = address.state;
        }
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