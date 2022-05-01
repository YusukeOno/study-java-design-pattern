package com.example.delegate;

public class PrintAdapter implements Print {

    Show show;

    public PrintAdapter() {
        super();
        show = new Show();
    }

    @Override
    public void printStr(String str) {
        System.out.println("========");
        show.showStr(str);
        System.out.println("========");
    }

    @Override
    public void printNumber(int value) {
        System.out.println("--------");
        show.showNumber(value);
        System.out.println("--------");
    }
}
