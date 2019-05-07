package com.automationmentoring.homework4.SecondTask;

public class CreditAccount extends BankAccount {
    double balance;

    @Override
    public void add(double amount) {
        balance += amount;
        super.add(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("It is possible to get a credit line for this account!");
        }
        balance -= amount;
        super.withdraw(amount);
    }

    @Override
    public void calculatePaymentFee(double amount) {
        if (balance >= 0) super.calculatePaymentFee(amount / 100);
        else super.calculatePaymentFee((amount * 5) / 100);
    }

    @Override
    public double getCurrentBalance() {
        return balance;
    }
}
