package com.automationmentoring.homework4.SecondTask;


public class DebitAccount extends BankAccount {

    private double debitBalance = 0.0;

    @Override
    public void withdraw(double amount) {
        if (amount > debitBalance) {
            System.out.println("It is impossible to get more money than the account currently has!!");
        } else {
            debitBalance -= amount;
            super.withdraw(amount);
        }
    }

    @Override
    public void add(double amount) {
        debitBalance += amount;
        super.add(amount);
    }

    @Override
    public double getCurrentBalance() {
        return debitBalance;
    }

    @Override
    public void calculatePaymentFee(double amount) {
        super.calculatePaymentFee(amount / 100);
    }
}
