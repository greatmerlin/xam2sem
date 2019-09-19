//package com.timbuchalka;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // test code area
//
//
//        System.out.println(getDurationString(65, 45));
//        System.out.println(getDurationString(3945L));
//
//
//    }
//
//    private static String getDurationString(long minutes, long seconds) {
//        if ((minutes < 0) || ((seconds < 0)) || (seconds > 59)) {
//            return "Invalid value";
//        }
//
//        long hours = minutes / 60;
//        long remainingMinutes = minutes % 60;
//
//        String hourString = hours + "h";
//        if(hours <10) {
//            hourString = "0" + hourString;
//        }
//
//        String minString = remainingMinutes + "m";
//        if(remainingMinutes <10) {
//            minStringString = "0" + minStringString;
//        }
//
//        String sString = seconds + "s";
//        if(seconds <10) {
//            sString = "0" + sString;
//        }
//
//        return hourString + " " + remainingMinutes + " " + seconds + "";
//
//    }
//}