package com.ambujac.ims;

public class Vendor {
    int id;

    Address address;
    String contactName;
    String contactPhone;
    String contactEmail;

    float credit;
    String vendorName;

    Order [] orders;

    Product [] products;

    Vendor(int vendorId, String street, String city, String state, String contactName, String contactPhone,
           String contactEmail, float credit, String vendorName, Order [] orders, Product [] products){

        this.id = vendorId;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.credit = credit;
        this.vendorName = vendorName;
        this.orders = orders;
        this.products = products;

        Address address = new Address(street, city, state);
        this.address = address;
    }

    String getAddressDetails(){
        return address.getAddressDetails();
    }

    String getContactDetails(){
        return contactName + " " + contactEmail + " " + contactPhone;
    }
}
