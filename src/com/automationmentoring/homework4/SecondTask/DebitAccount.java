package com.automationmentoring.homework4.SecondTask;

public class DebitAccount extends BankAccount {

    private double debitBalance = 0.0;
    private double fee;

    @Override
    public void withdraw(double amount) {
        if (amount > debitBalance) {
            System.out.println("It is impossible to get more money than the account currently has!!");
        } else {
            debitBalance -= amount;
            notifyObservers(this, amount, Action.WITHDRAW);
        }
    }

    @Override
    public void add(double amount) {
        if(amount < 0) throw new RuntimeException();
        debitBalance += amount;
        notifyObservers(this, amount, Action.ADD);
    }

    @Override
    public double getCurrentBalance() {
        return debitBalance;
    }

    @Override
    public void calculatePaymentFee(double amount) {
        fee = amount / 100;
        debitBalance -= fee;
        notifyObservers(this, fee, Action.CALCULATE);
    }
}
