package pl.mzelechowski;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount1 {
    private int balance;

    public BankAccount1(int balance) {
        this.balance = balance;
    }
/** klasa wewnętza dynamiczna - bo nie ma słowa static*/
    public class BalanceCounter implements ActionListener {
        private double interestRate;

        public BalanceCounter(double interesRate) {
            this.interestRate = interesRate;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int newBalance = (int) (BankAccount1.this.balance + balance * interestRate);
            System.out.println("Changing account balance from: "+ balance + " to " + newBalance);
            BankAccount1.this.balance = newBalance;
        }
    }
}
