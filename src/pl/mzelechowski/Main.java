package pl.mzelechowski;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    private static void task1(){
        initWindow();
        BankAccount1 account = new BankAccount1(1000);
        BankAccount1.BalanceCounter counter = account.new BalanceCounter(0.02);
        Timer timer = new Timer(1000, counter);
        timer.setDelay(0);
        timer.start();
    }
    private static void initWindow(){
        JFrame frame = new JFrame("Bank account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JButton button = new JButton("close");
    }
}
