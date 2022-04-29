package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextBuilder extends Builder {

    StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeHeader() {
        stringBuffer.append("========\n");
        stringBuffer.append("従業員一覧\n");
        stringBuffer.append("========\n");
    }

    @Override
    public void makeEmployeeList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            stringBuffer.append("氏名：" + employee.getName() + "\n");
            stringBuffer.append("年齢：" + employee.getAge() + "\n");
            stringBuffer.append("部署名：" + employee.getDepartmentName() + "\n");
            stringBuffer.append("\n");
        }
    }

    public String getResult() {
        String fileName = "employee.txt";
        File file = new File(fileName);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName;
    }
}
