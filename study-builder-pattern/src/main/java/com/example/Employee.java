package com.example;

public class Employee {

    // 名前
    private String name;

    // 年齢
    private int age;

    // 部署名
    private String departmentName;

    // コンストラクタ
    public Employee(String name, int age, String departmentName) {
        super();
        this.name = name;
        this.age = age;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
