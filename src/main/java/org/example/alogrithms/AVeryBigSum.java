package org.example.alogrithms;

import java.util.List;
public class AVeryBigSum {

//    In this challenge, you are required to calculate
//    and print the sum of the elements in an array,
//    keeping in mind that some of those integers may be quite large.

    public static long aVeryBigSum(List<Long> ar) {
        Long sum = Long.valueOf(0);
        for(Long a : ar) {
            sum += a;
        }
        return sum;
    }
}
