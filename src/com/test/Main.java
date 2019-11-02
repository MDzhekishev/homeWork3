package com.test;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Alina";
        names[1] = "Tumar";
        names[2] = "Shirin";

        switch (names[0]) {
            case "Alina":
                System.out.println("Good morning " + " " + names[0]);
            case "Tumar":
                System.out.println("Good afternoon " + " " + names[1]);
            case "Shirin":
                System.out.println("Good evening " + " " + names[2]);
                break;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi : " + names[i]);

        }

    }
}
