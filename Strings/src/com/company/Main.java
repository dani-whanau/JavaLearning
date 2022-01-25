package com.company;

public class Main {

    public static void main(String[] args) {
        // STRINGS
        String message = "  Hello World" + "!!  ";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message);
    }
}
