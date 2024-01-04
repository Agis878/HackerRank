package org.example.alogrithms;

import java.text.*;
import java.util.*;


public class TimeConversion {

//    Given a time in -hour AM/PM format, convert it to military (24-hour) time.

    public static void main(String[] args) {
        String timeString = "07:05:45PM";
        System.out.println(timeConversion(timeString));
    }
    public static String timeConversion(String s) {

        String inputFormat = "hh:mm:ssa";
        SimpleDateFormat inputSdf = new SimpleDateFormat(inputFormat);
        String militaryTimeString = "";

        try {
            Date time = inputSdf.parse(s);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(time);

            SimpleDateFormat militaryTimeSdf = new SimpleDateFormat("HH:mm:ss");
            militaryTimeString = militaryTimeSdf.format(calendar.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return militaryTimeString;
    }
}
