package com.example.pc;

import com.example.factory.Factory;
import com.example.factory.Product;

import java.util.ArrayList;
import java.util.List;

public class PcFactory extends Factory {

    private List<String> serialNumberList = new ArrayList<>();
    @Override
    protected Product createProduct(String serialNumber) {
        return new Pc(serialNumber);
    }

    @Override
    protected void registerProduct(Product product) {
        serialNumberList.add(((Pc) product).getSerialNumber());
    }

    public List<String> getSerialNumberList() {
        return serialNumberList;
    }
}
