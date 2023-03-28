package org.homework_curs7.banking;

public class BRD implements BankProvider {
    private static double initialBalance = 2586;
    private double addAmount = 2.5;
    private double witdrawedAmount = 2865.5;
    private double finalBalance = 0;

    @Override
    public double depositMoney() {
        finalBalance = initialBalance + addAmount;
        System.out.println("Initial amount: " + initialBalance);
        System.out.println("Deposit amount:" + addAmount);
        System.out.println("Final balance: " + finalBalance);
        return finalBalance;
    }

    @Override
    public double withdrawMoney() {
        if (initialBalance > 0 && witdrawedAmount <= finalBalance) {
            finalBalance -= witdrawedAmount;
            System.out.println("Initial balance is: " + finalBalance);
            System.out.println("Witdrawed amount: " + witdrawedAmount);
            System.out.println("Final balance: " + finalBalance);
        }
        System.out.println("Not enough money for withdrawal: " + finalBalance);
        return 0;

    }
}


