package com.example;


import static com.example.Console.readNumber;

public class Main {

    public static void main(String[] args) {
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());



//        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortgageCalculator(principal, annualInterest, years);
//        var report = new MortgageReport(calculator);
//
//        report.printMortgage();
//        report.printPaymentSchedule();
    }

}
