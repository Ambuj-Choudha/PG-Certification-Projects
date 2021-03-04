package com.ambujac.ims;

public class Product {
    int id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    Product(int ProductId, String ProductName, String ProductCategory, float ProductSalesPrice,
            float ProductCost, int ProductQuantity, boolean ProductActive){
        id = ProductId;
        name = ProductName;
        category = ProductCategory;
        salesPrice = ProductSalesPrice;
        cost = ProductCost;
        quantity = ProductQuantity;
        active = ProductActive;
    }

    Product(){

    }

    Product(Product ProductObj){
        id = ProductObj.id;
        name = ProductObj.name;


    }

    float getProfitOrLoss(){
        return salesPrice - cost;
    }

    void activate(){

        active = true;
    }

    void deactivate(){

        active = false;
    }
}
