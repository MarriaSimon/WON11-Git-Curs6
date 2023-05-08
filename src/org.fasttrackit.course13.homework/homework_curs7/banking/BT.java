package org.fasttrackit.course13.homework.homework_curs7.banking;

public class BT implements BankProvider {
    private static double initialBalance = 4586.89;
    private double addAmount = 234;
    private double witdrawedAmount = 6587.52;
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
