package com.calendar;

public class Printer {
    public static void titleCalendar (){
        System.out.print("Mo Tu We Th Fr");
        Colors.startRedColor();
        System.out.println(" Se Su");
        Colors.stopColor();
    }
    public static void printDayOfMonth(int i){
        System.out.printf("%2d ", i);
    }
    public static void printBlankOutput (){
        System.out.println();
    }
    public static void printSpace(){
        System.out.print("   ");
    }
}
