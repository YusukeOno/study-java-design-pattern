package com.example;

import java.util.Calendar;
import java.util.Date;

public class HolidayState implements WeekState {

    private final static WeekState holidayState = new HolidayState();

    private HolidayState() {
        super();
    }

    public static WeekState getInstance() {
        return holidayState;
    }

    @Override
    public void setDate(Shop shop) {
        Date workDate = shop.getDate();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(workDate);

        int calDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        if (!(calDayOfWeek == Calendar.SATURDAY ||
                calDayOfWeek == Calendar.SUNDAY)) {
            // 平日
            shop.changeState(WeekdaysState.getInstance());
        }
    }

    @Override
    public void open(Date date) {
        System.out.println(sdf.format(date) + "*土日：開店時間は１０時です");
    }

    @Override
    public void close(Date date) {
        System.out.println(sdf.format(date) + "*土日：閉店時間は２１時です");
    }
}
