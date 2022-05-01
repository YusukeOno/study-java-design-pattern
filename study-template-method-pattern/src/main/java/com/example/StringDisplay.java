package com.example;

public class StringDisplay extends AbstractProcess {

    private String string;

    public StringDisplay(String string) {
        super();
        this.string = string;
    }

    @Override
    protected void before() {
        System.out.println("=== "
                + getClass().getSimpleName()
                + " start ===");
    }

    @Override
    protected void process() {
        System.out.println(string);
    }

    @Override
    protected void after() {
        System.out.println("=== "
                + getClass().getSimpleName()
                + " end ===");
    }
}
