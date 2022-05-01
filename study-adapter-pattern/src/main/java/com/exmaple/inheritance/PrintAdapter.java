package com.exmaple.inheritance;

public class PrintAdapter extends Show implements Print{
    @Override
    public void printStr(String str) {
        System.out.println("========");
        showStr(str);
        System.out.println("========");
    }

    @Override
    public void printNumber(int value) {
        System.out.println("--------");
        showNumber(value);
        System.out.println("--------");
    }
}
