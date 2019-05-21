package com.automationmentoring.homework4.SecondTask;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount extends Observable {
    private List<Observer> observers = new ArrayList<>();

    public abstract void withdraw(double amount);

    public abstract void add(double amount);

    public abstract void calculatePaymentFee(double amount);

    public abstract double getCurrentBalance();

    @Override
    public void notifyObservers(BankAccount bankAccount, double amount, Action action){
        observers.forEach(obs -> obs.update(bankAccount, amount, action));
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }


}
