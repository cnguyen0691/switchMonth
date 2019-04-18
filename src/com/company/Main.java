package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);

        System.out.print("Input your days: ");
        int days = day.nextInt();
        String monthName;
        switch (days) {
            case 31:  monthName = "January March May July August October December";
                break;
            case 28:  monthName = "February";
                break;
            case 30:  monthName = "April June September November";
                break;
            default: monthName = "no month exactly " + days + " days";
                break;
        }
        System.out.println(monthName);
    }
}
