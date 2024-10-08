package com.ATM;

import java.util.Scanner;

public class ATMFunctionality {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM Machine. Please enter ATM PIN.");

        int predefinePin = 123;
        Scanner sc = new Scanner(System.in);
        int userAtmPin = sc.nextInt();

        if (userAtmPin != predefinePin){
            System.out.println("Incorrect ATM Pin number");
            System.exit(0);
        }
        AtmService atmService = new AtmService();
        while (true){
            System.out.println("1. View Available Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. View MiniStatement");
            System.out.println("5. Exit");

            System.out.println("Enter choice");
            int ch = sc.nextInt();


            if (ch == 1){
                atmService.getBalance();
            } else if (ch ==2 ) {
                System.out.println("enter amount of withdraw ->");
                double amount = sc.nextDouble();
                atmService.withdrawAmount(amount);
            } else if (ch == 3) {
                System.out.println("enter Deposit Amount ->");
                double amount = sc.nextDouble();
                atmService.depositAmount(amount);
            } else if (ch == 4) {
                atmService.viewMiniStatement();
            } else if (ch == 5) {
                System.out.println("Please Collect your ATM card before leaving.");
                sc.close();
                System.exit(0);
            } else if (ch == 5) {
                System.out.println("Please enter correct choice.");
            }
        }
    }
}
