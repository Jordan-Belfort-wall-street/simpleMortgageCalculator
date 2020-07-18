package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // simple Mortgage calculator
        final byte monthsInYear = 12;
        final byte percentage = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("annual Interest Rate: ");
        float InterestRate = scanner.nextFloat();
        float calculation = InterestRate / percentage / monthsInYear;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        // equation for calculating mortgage payments
        double mortgageCalculation = principal * (calculation * (Math.pow(1 + calculation, years * monthsInYear)) ) /
                (Math.pow(1 + calculation, years * monthsInYear ) - 1);

        String result = NumberFormat.getCurrencyInstance().format(mortgageCalculation);
        System.out.println(result);

    }
}

