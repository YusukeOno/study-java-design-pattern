package com.example;

public class Vanilla extends Ice {

    private int price = 50;

    public Vanilla(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getPrice() {
        return price + iceCream.getPrice();
    }

    @Override
    public String getName() {
        return "Vanilla" + iceCream.getName();
    }

}
