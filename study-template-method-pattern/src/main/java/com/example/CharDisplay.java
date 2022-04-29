package com.example;

public class CharDisplay extends AbstractProcess {

    private char ch;

    public CharDisplay(char ch) {
        super();
        this.ch = ch;
    }

    @Override
    protected void before() {
        System.out.print("渡された文字は「");
    }

    @Override
    protected void process() {
        System.out.print(ch);
    }

    @Override
    protected void after() {
        System.out.println("」です");
    }
}
