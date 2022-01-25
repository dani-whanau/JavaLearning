package com.company;

public class Main {

    public static void main(String[] args) {
// CASTING + TYPE CONVERSION (Explicit and Implicit)
// Implicit Casting (auto)
// Byte > short > int > long
//        short x = 1;
//        int y = x + 2;

// float > double
//        double x = 1.1;
//        double y = double x + 2; // 2.0

// Explicitly making an int (can only happen between compatible types)
//        double x = 1.1;
//        int y = (int)x + 2; // 2.0

// Take a string and return it as an int
        String x = "1.1";
        //int y = Integer.parseInt(x) + 2;
        double y = Double.parseDouble(x)+2;
        System.out.println(y);

    }
}
