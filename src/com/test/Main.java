package com.test;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Alina";
        names[1] = "Tumar";
        names[2] = "Shirin";

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi : " + names[i]);


            switch (names[i]) {
                case "Alina":
                    System.out.println("Good morning " + " " + names[0]);
                    break;
                case "Tumar":
                    System.out.println("Good afternoon " + " " + names[1]);
                    break;
                case "Shirin":
                    System.out.println("Good evening " + " " + names[2]);
                    break;
            }

        }

    }
}
