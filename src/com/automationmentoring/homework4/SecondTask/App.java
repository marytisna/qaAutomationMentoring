package com.automationmentoring.homework4.SecondTask;

public class App {

    public static void main(String[] args) {
        BankAccount credit = new CreditAccount();
        BankAccount debit = new DebitAccount();

        Observer logger = new Logger();

        credit.addObserver(logger);
        debit.addObserver(logger);

        credit.add(-10);
        credit.withdraw(20);
        credit.calculatePaymentFee(20);

        debit.add(100);
        debit.withdraw(50);
        debit.calculatePaymentFee(50);

    }
}
