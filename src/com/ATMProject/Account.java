package com.ATMProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    //getters and setters for above vars
    public int getCustomerNumber() { return customerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }
    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }

    //methods to cal withdrawl and deposits for checking and savings account
    public double calCheckingWithdraw(double amount)
    {
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }
    public double calSavingWithdraw(double amount)
    {
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }
    public double calCheckingDeposit(double amount)
    {
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }
    public double calSavingDeposit(double amount)
    {
        savingBalance=(savingBalance+amount);
        return savingBalance;
    }

//methods which makes use of above functionality
    public void getCheckingWithdrawInput()
    {
        double amount=input.nextDouble();
        if((checkingBalance-amount)>=0)
        {
            calCheckingWithdraw(amount);
            System.out.println("checking balance after withdraw is: "+checkingBalance);
        }
        else
        {
            System.out.println("balance cannot be negative\n");
        }
    }

    public void getSavingWithdrawInput()
    {
        double amount=input.nextDouble();
        if((savingBalance-amount)>=0)
        {
            calSavingWithdraw(amount);
            System.out.println("saving balance after with draw is: "+savingBalance);
        }
        else
        {
            System.out.println("balance cannot be negative\n");
        }
    }

    public void getCheckingDepositInput()
    {
        double amount=input.nextDouble();
        if((checkingBalance+amount)>=0)
        {
            calCheckingDeposit(amount);
            System.out.println("checking balance after deposit is: "+checkingBalance);
        }

    }

    public void getSavingDepositInput()
    {
        double amount=input.nextDouble();
        if((savingBalance+amount)>=0)
        {
            calSavingDeposit(amount);
            System.out.println("saving balance after deposit is: "+savingBalance);
        }
    }
}
