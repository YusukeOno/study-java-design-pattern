package com.example;

public class Main {
    public static void main(String[] args) {

        AbstractProcess process1 = new CharDisplay('H');
        process1.execute();

        System.out.println();

        AbstractProcess process2 = new StringDisplay("Hello");
        process2.execute();
    }
}
