package ATMWORK;

import java.util.Scanner;

public class Atmmachine{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int balance = 1000;
        int pin = 1234;
        final int quickAmount = 200;
        System.out.print("Enter your pin: ");
        int enteredPin = sc.nextInt();
        if (enteredPin != pin) {
            System.out.println("Incorrect pin");
            return;
        }
        int option;
        do {
            System.out.println("Atm Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Quick Withdraw");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter withdrawl amount: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawl successful");
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful");
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;
                case 4:
                    System.out.print("Enter current pin: ");
                    int currentPin = sc.nextInt();
                    if (currentPin == pin) {
                        System.out.print("Enter new pin: ");
                        pin = sc.nextInt();
                        System.out.println("Pin changed successful");
                    } else {
                        System.out.println("Wrong pin");
                    }
                    break;
                case 5:
                    if (balance >= quickAmount) {
                        balance -= quickAmount;
                        System.out.println("Quick withdrawl successful");
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 6:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (option != 6);
        sc.close();
    }
}
