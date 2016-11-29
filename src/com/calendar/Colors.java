package com.calendar;
public class Colors {
    public static void startRedColor(){
        System.out.print((char) 27 + "[31m ");
    }
    public static void startBlueColor(){
        System.out.print((char) 27 + "[34m");
    }
    public static void stopColor(){
        System.out.print((char) 27 + "[0m");
    }
}
