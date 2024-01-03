package org.example.alogrithms;

public class Staircase {

//   Print a staircase.
//   Its base and height are both equal to n.
//   It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
//    Write a program that prints a staircase of size n.
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String spaces = new String(new char[n - i]).replace('\0', ' ');
            String hashes = new String(new char[i]).replace('\0', '#');
            System.out.println(spaces + hashes);
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
