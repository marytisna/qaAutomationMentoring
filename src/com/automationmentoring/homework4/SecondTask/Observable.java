package com.automationmentoring.homework4.SecondTask;

public abstract class Observable {

    public abstract void addObserver(Observer obs);

    public abstract void notifyObservers(BankAccount bankAccount, double amount, Action action);
}
