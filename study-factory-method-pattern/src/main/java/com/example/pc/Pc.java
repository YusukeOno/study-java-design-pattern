package com.example.pc;

import com.example.factory.Product;

public class Pc extends Product {

    private String serialNumber;

    public Pc(String serialNumber) {
        super();
        System.out.println(serialNumber + "のPCを作る");
        this.serialNumber = serialNumber;
    }

    @Override
    public void use() {
        System.out.println(serialNumber + "のPCを使う");
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
}
