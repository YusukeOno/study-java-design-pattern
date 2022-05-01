package com.example;

import java.util.Calendar;
import java.util.Date;

public class WeekdaysState implements WeekState {

    private final static WeekState weekdaysState = new WeekdaysState();

    private WeekdaysState() {
        super();
    }

    public static WeekState getInstance() {
        return weekdaysState;
    }

    @Override
    public void setDate(Shop shop) {
        Date workDate = shop.getDate();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(workDate);

        int calDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        if ((calDayOfWeek == Calendar.SATURDAY ||
                calDayOfWeek == Calendar.SUNDAY)) {
            // 休日
            shop.changeState(HolidayState.getInstance());
        }
    }

    @Override
    public void open(Date date) {
        System.out.println(sdf.format(date) + "平日：開店時間は１１時です");
    }

    @Override
    public void close(Date date) {
        System.out.println(sdf.format(date) + "平日：閉店時間は２０時です");
    }
}
