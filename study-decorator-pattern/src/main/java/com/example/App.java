package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        IceCream corn = new Corn();

        IceCream vanilla = new Vanilla(corn);
        System.out.println(vanilla.getName() + ":" + vanilla.getPrice());

        IceCream choco = new Chocolate(corn);
        System.out.println(choco.getName() + ":" + choco.getPrice());

        IceCream mix = new Chocolate(new Vanilla(corn));
        System.out.println(mix.getName() + ":" + mix.getPrice());
    }
}
