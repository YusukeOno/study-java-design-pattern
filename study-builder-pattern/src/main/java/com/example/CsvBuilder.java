package com.example;

import java.util.List;

public class CsvBuilder extends Builder {

    StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeHeader() {
        stringBuffer.append("氏名,年齢,部署名\n");
    }

    @Override
    public void makeEmployeeList(List<Employee> employeeList) {

        // CSV一覧の文字列を生成
        for (Employee employee : employeeList) {
            stringBuffer.append(employee.getName() + ",");
            stringBuffer.append(employee.getAge() + ",");
            stringBuffer.append(employee.getDepartmentName() + "\n");
        }

        // 最後の改行コードを取り除く
        stringBuffer.substring(0, stringBuffer.length() - 1);
    }

    public String getResult() {
        return stringBuffer.toString();
    }
}
