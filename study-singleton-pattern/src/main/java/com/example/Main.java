package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("2つは同じインスタンスです");
        } else {
            System.out.println("2つは異なるインスタンスです");
        }

        System.out.println("End");
    }
}
