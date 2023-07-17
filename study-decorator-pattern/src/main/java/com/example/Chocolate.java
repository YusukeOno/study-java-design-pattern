package com.example;

public class Chocolate extends Ice {

    private int price = 70;

    protected Chocolate(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getPrice() {
        return price + iceCream.getPrice();
    }

    @Override
    public String getName() {
        return "Choco" + iceCream.getName();
    }

}
