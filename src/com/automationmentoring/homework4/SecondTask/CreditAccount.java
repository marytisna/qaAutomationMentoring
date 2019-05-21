package com.automationmentoring.homework4.SecondTask;

public class CreditAccount extends BankAccount {
    private double balance;
    private double fee;

    @Override
    public void add(double amount) {
        if(amount < 0) throw new RuntimeException();
        balance += amount;
        notifyObservers(this, amount, Action.ADD);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("It is possible to get a credit line for this account!");
        }
        balance -= amount;
        notifyObservers(this, amount, Action.WITHDRAW);
    }

    @Override
    public void calculatePaymentFee(double amount) {
        if (balance >= 0) fee = amount / 100;
        else fee = (amount * 5) / 100;
        balance -= fee;
        notifyObservers(this, fee, Action.CALCULATE);
    }

    @Override
    public double getCurrentBalance() {
        return balance;
    }
}
