package com.exmaple.inheritance;

public class Main {
    public static void main(String[] args) {
        // ver.1
        System.out.println("version1");
        Show ver1 = new Show();
        ver1.showStr("hello world");
        ver1.showNumber(100);

        // NewLine
        System.out.println();

        // ver.2
        System.out.println("version2");
        Print ver2 = new PrintAdapter();
        ver2.printStr("Hello World");
        ver2.printNumber(200);
    }
}
