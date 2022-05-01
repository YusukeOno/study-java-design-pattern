package com.example;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        Shop shop = new Shop();

        for (int i = 0; i < 7; i++) {
            shop.setDate(date);

            shop.open();

            shop.close();

            date = addOneDay(date);
            
        }
    }

    private static Date addOneDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // +1 day
        calendar.add(Calendar.DATE, 1);

        return calendar.getTime();
    }
}
