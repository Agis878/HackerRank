package org.example.alogrithms;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

//    You are in charge of the cake for a child's birthday.
//    You have decided the cake will have one candle for each year
//    of their total age. They will only be able to blow out
//    the tallest of the candles. Count how many candles are tallest.

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int maxCandleSize = candles.get(candles.size() - 1);
        int counter = 0;
        for (int i = candles.size() - 1; i >= 0; i--) {
            if (candles.get(i) == maxCandleSize) {
                counter += 1;
            } else {
                break;
            }
        }
        return counter;
    }
}
