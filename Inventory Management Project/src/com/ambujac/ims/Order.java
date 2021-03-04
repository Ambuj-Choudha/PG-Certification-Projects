package com.ambujac.ims;

public class Order {
    int id;
    int orderedQuantity;
    float amountPaid;

    Vendor vendor;

    Order(int orderId, int orderedQuantity, float amountPaid){
        this.id = orderId;
        this.orderedQuantity = orderedQuantity;
        this.amountPaid = amountPaid;

    }


}
