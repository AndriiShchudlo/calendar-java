package com.calendar;

import java.time.*;

public class CalendarGeneration {

    public void generate(int day, LocalDate date) {
        // String date = year + "-"+ month;

        int firstDayOfWeek = date.getDayOfWeek().getValue();
        int daysInMonths = date.lengthOfMonth();


        Printer.titleCalendar();

        for (int i = 0; i < firstDayOfWeek - 1; i++)
            Printer.printSpace();

        int days_week = 7;

        for (int i = 1; i <= daysInMonths; i++) {
            if (i==day)
                Colors.startBlueColor();
            Printer.printDayOfMonth(i);
            Colors.stopColor();
            if (((i + firstDayOfWeek - 1) % days_week == 0) || (i == daysInMonths)) Printer.printBlankOutput();
        }
    }
}
