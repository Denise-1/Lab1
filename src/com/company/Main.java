package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = input.nextLine();

        System.out.println("What is your age?: ");
        int age = input.nextInt();

        System.out.println("How many hours do you work?: ");
        int hours = input.nextInt();

        System.out.println("What is your payrate?: ");
        double payRate = input.nextDouble();

        final int TAX = 6;                        // must be a constant
        boolean fullTime = true;

        double grossPay = hours * payRate;        // calculates gross pay
        double netPay = grossPay - TAX;           // calculates net pay

        System.out.println("Your name is: " + name);
        System.out.println("You are: " + age + " years old");
        System.out.println("You work: " + hours + " hours");
        System.out.println("Your pay rate is: $" + payRate );
        System.out.println("You pay: $" + TAX + " in tax");
        System.out.println("Your gross pay is: $" + grossPay);
        System.out.println("Your net pay is: $" + netPay);
        System.out.println("Are you full time? " + fullTime);

    }
}
