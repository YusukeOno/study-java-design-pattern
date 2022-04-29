package com.example;

import java.util.List;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        super();
        this.builder = builder;
    }

    public void construct(List<Employee> employeeList) {
        builder.makeHeader();

        // 一覧作成
        builder.makeEmployeeList(employeeList);
    }
}
