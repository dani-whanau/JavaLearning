package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// READING INPUT (like prompt in JS)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are" + " " + name);
    }
}
