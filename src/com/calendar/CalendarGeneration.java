package com.calendar;

import java.time.*;

import static java.time.temporal.TemporalAdjusters.*;

public class CalendarGeneration {

    public static int firstDayOfWeek(int year,int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        int dayOfWeek = date.with(firstDayOfMonth()).getDayOfWeek().getValue();
        return dayOfWeek;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) return true;
        if (year % 400 == 0) return true;
        return false;
    }

    public static int daysOfMonth(int month, int year) {
        int february = 2;
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // check for leap year
        if (month == february && isLeapYear(year)) days[month] = 29;
        return days[month];
    }

    public static void Generation(int year, int month, int day) {
        // String date = year + "-"+ month;
        int first_day_of_week = CalendarGeneration.firstDayOfWeek(year, month,day);
        int days_of_month = CalendarGeneration.daysOfMonth(month, year);
        int days_week = 7;

        Printer.titleCalendar();

        for (int i = 0; i < first_day_of_week - 1; i++)
            Printer.printSpace();
        for (int i = 1; i <= days_of_month; i++) {
            if (i==day)
                Colors.startBlueColor();
            Printer.printDayOfMonth(i);
            Colors.stopColor();
            if (((i + first_day_of_week - 1) % days_week == 0) || (i == days_of_month)) Printer.printBlankOutput();
        }
    }
}
