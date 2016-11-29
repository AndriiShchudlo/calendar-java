package com.calendar;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int year = date.getYear();
        int day = date.getDayOfMonth();

        CalendarGeneration.Generation(year, month, day);

    }
}

