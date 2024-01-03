package org.example.alogrithms;

import java.util.*;

public class MiniMaxSum {

//    Given five positive integers, find the minimum and maximum values
//    hat can be calculated by summing exactly four of the five integers.
//    Then print the respective minimum and maximum values as a single line
//    of two space-separated long integers.

    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        Collections.sort((arr));
        for (Integer a : arr) {
            sum += a;
        }
        long sumMin = sum - arr.get(arr.size() - 1);
        long sumMax = sum - arr.get(0);

        System.out.printf("%s %s", sumMin, sumMax);
    }


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(7, 69, 2, 221, 8974));
        miniMaxSum(numbers);

    }
}
