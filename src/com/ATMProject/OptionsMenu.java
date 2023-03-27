package com.ATMProject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;//takes input from commandline

public class OptionsMenu extends Account {

    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();

    public void getLogin() throws IOException {
        int x=1;
        do{
            try{
                data.put(9,9);
                data.put(5,5);
                System.out.println("Welcome to ATM project");
                System.out.println("enter customer number");
                setCustomerNumber(menuInput.nextInt());
                System.out.println("enter pin");
                setPinNumber(menuInput.nextInt());
            }catch(Exception e)
            {
                System.out.println("invalid characters");
                x=2;
            }
            int cn=getCustomerNumber();
            int pn=getPinNumber();
            if(data.containsKey(cn)&&data.get(cn)==pn)
                getAccountType();
            else
                System.out.println("wrong customer number or pin number\n ***********");
        }while(x==1);
    }
    public void getAccountType() {
        System.out.println("select account you want to access");
        System.out.println("1.checking account");
        System.out.println("2.savings account");
        System.out.println("3.exit");
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:getChecking();
            break;
            case 2:getSaving();
            break;
            case 3:
                System.out.println("Thanks for using ATM\n *********");
                break;
            default:
                System.out.println("Invalid choice");
                //getAccountType();
                break;

        }
    }
    public void getChecking() {
        System.out.println("checking account");
        System.out.println("1.view balance");
        System.out.println("2.withdraw cash");
        System.out.println("3.deposit cash");
        System.out.println("exit");
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("existing balance is $0.00\n");
                getAccountType();
                break;
            case 2:
                System.out.println("enter the amount you want to withdraw");
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                System.out.println("enter the amount you want to deposit");
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("thanks for the transaction\n");
                break;
            default:
                System.out.println("invalid input\n");
                //getChecking();
        }
    }
    public void getSaving() {
        System.out.println("saving account");
        System.out.println("1.view balance");
        System.out.println("2.withdraw cash");
        System.out.println("3.deposit cash");
        System.out.println("exit");
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("existing balance is $0.00\n");
                getAccountType();
                break;
            case 2:
                System.out.println("enter the amount you want to withdraw");
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                System.out.println("enter the amount you want to deposit");
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("thanks for the transaction\n");
                break;
            default:
                System.out.println("invalid input\n");
                //getChecking();
        }
    }
}
