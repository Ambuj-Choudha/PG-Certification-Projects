package com.ambujac.ims;

public class Customer {
    int id;

    String addressStreet;
    String addressCity;
    String addressState;

    String contactName;
    String contactPhone;
    String contactEmail;

    int transactionCount;

    String getAddressDetails() {
        return addressStreet + ", " + addressCity + ", " + addressState;
    }

    String getContactDetails() {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }

    int getTransactionCount() {
        return transactionCount;
    }

    float calculateDiscount() {
        float discount = transactionCount * 0.1f;
        return Math.min(discount, 10.0f);
    }
}