package com.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        int day = date.getDayOfMonth();

        CalendarGeneration calendar = new CalendarGeneration();
        calendar.generate(day, date);


        for (DayOfWeek d : DayOfWeek.values()) {
            String name = d.getDisplayName(TextStyle.SHORT, Locale.getDefault());
            System.out.printf(" %s ", name);
        }

    }
}

