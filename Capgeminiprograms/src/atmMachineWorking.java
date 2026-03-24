import java.util.Scanner;

public class atmMachineWorking {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int balance = 1000;
        int pin = 1234;
        final int QUICK_AMOUNT = 200;

        System.out.println("===== WELCOME TO ATM =====");

        // PIN check
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Quick Withdraw (200)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // Withdraw
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Invalid or insufficient balance.");
                    }
                    break;

                // Deposit
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                // Check balance
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;

                // Change PIN
                case 4:
                    System.out.print("Enter current PIN: ");
                    int currentPin = sc.nextInt();

                    if (currentPin == pin) {
                        System.out.print("Enter new PIN: ");
                        pin = sc.nextInt();
                        System.out.println("PIN changed successfully.");
                    } else {
                        System.out.println("Wrong PIN.");
                    }
                    break;

                // Quick withdraw
                case 5:
                    if (balance >= QUICK_AMOUNT) {
                        balance -= QUICK_AMOUNT;
                        System.out.println("Quick withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                // Exit
                case 6:
                    System.out.println("Thank you for using ATM 😊");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
