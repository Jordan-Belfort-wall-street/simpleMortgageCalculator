package com.company;

import javax.sound.midi.SysexMessage;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // simple mortgage calculator
        Scanner scanner = new Scanner(System.in);
        final byte monthsInYear = 12;
        final byte percent = 100;
        int principal;
        float annualInterest;
        short years;

        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >0 && annualInterest <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextShort();
            if (years > 0 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        float calculation = annualInterest / percent / monthsInYear;
        // equation for calculating mortgage payments
        double mortgage = principal * (calculation * (Math.pow(1 + calculation, years * monthsInYear))) /
                (Math.pow(1 + calculation, years * monthsInYear ) - 1);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Morgage: " + result);
    }
}

