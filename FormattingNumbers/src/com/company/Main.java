package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
// FORMATTING NUMBERS $
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);

// FORMATTING NUMBERS % (method chaining)
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
