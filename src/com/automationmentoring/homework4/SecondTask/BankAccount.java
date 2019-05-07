package com.automationmentoring.homework4.SecondTask;

import java.math.BigDecimal;

public abstract class BankAccount extends Observable {
    public void withdraw(double amount) {
        notifyObservers(this, amount, Action.WITHDRAW);
    }

    public void add(double amount) {
        notifyObservers(this, amount, Action.ADD);
    }

    public void calculatePaymentFee(double amount) {
        notifyObservers(this, amount, Action.CALCULATE);
    }

    public abstract double getCurrentBalance();


}
