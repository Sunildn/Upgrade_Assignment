package com.FRS;

public class Passanger {
    int id;
    String name;
    String phone;
    String emailId;
    String street;
    String city;
    String state;

    String getAddressDetails() {
        return street + ", " + city + ", " + state;
    }
    void updateAddressDetails(String street, String city, String state){
        this.street =street;
        this.city = city;
        this.state = state;
    }
    String getContactDetails(){
        return  name + ", " + phone + ", " + emailId;
    }
    void updateContactDetails(String name,String phone,String emailId){
        this.name= name;
        this.phone= phone;
        this.emailId=emailId;
    }

    public Passanger(int id, String name, String phone, String emailId, String street, String city, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.emailId = emailId;
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public Passanger(Passanger passanger){
        id = passanger.id;
        name =passanger.name;
        phone = passanger.phone;
        emailId = passanger.emailId;
        street = passanger.street;
        city = passanger.city;
        state = passanger.state;
    }
}