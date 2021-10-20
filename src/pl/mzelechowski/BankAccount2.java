package pl.mzelechowski;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount2 {
    private int balance;

    public BankAccount2(int balance) {
        this.balance = balance;
    }
    public ActionListener createBalanceCounter(double interestRate){
        /** klasa lokalna */
        class BalanceCounter implements ActionListener{
            double interestRate;

            public BalanceCounter(double interestRate){
                this.interestRate=interestRate;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                int newBalance = (int) (BankAccount2.this.balance + balance * interestRate);
                System.out.println("Changing account balance from: "+ balance + " to " + newBalance);
                BankAccount2.this.balance = newBalance;
            }
        }
        return  new BalanceCounter(interestRate);
    }
}
