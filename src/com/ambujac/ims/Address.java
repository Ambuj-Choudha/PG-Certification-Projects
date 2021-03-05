package com.ambujac.ims;

public class Address {

    String addressStreet;
    String addressCity;
    String addressState;

    public Address(String addressStreet, String addressCity, String addressState) {
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressState = addressState;
    }

    String getAddressDetails(){
        return addressStreet + " " + addressCity + " " + addressState;
    }
}
