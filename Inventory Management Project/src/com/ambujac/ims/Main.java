package com.ambujac.ims;

public class Main {

    public static void main(String[] args) {
	    Product laptop = new Product();
	    laptop.id = 1;
	    laptop.name = "Dell Inspiron 7548";
        laptop.cost = 200000;
        laptop.salesPrice = 990000;
        laptop.active = true;

        Product laptop2 = new Product(laptop);

        float profit = laptop.getProfitOrLoss();
        System.out.println(profit);
    }
}
