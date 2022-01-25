package com.company;

public class Main {

    public static void main(String[] args) {
	String role = "admin";

    switch (role) {
        case "admin":
            System.out.println("You're admin");
            break;
        case "moderator":
            System.out.println("You're moderator");
            break;
        default:
            System.out.println("You're a guest");
    }
    }
}
