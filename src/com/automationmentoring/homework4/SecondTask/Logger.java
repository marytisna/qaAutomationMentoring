package com.automationmentoring.homework4.SecondTask;

import java.math.BigDecimal;

public class Logger implements Observer {
    public void update(BankAccount bankAccount, double amount, Action action) {
        final Class<? extends BankAccount> clazz = bankAccount.getClass();
        final double balance = bankAccount.getCurrentBalance();

        System.out.printf("%s has been %s for the %s; total balance: %s", amount, action.getAction(), clazz.getSimpleName(), balance);
        System.out.println();
    }

}
