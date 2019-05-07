package com.automationmentoring.homework4.SecondTask;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void notifyObservers(BankAccount bankAccount, double amount, Action action) {
        observers.forEach(obs -> obs.update(bankAccount, amount, action));
    }
}
