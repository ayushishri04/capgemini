//package system;
//
//import java.util.Scanner;
//
//public class InventorySystem {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] product = {"Pen", "Notebook", "Pencil"};
//        double[] price = {10, 50, 5};
//        int[] stock = {100, 50, 200};
//        final double GST = 18.0; 
//        double subtotal = 0;
//
//        System.out.println("---- Products ----");
//        for (int i = 0; i < product.length; i++) {
//            System.out.println(product[i] + " | ₹" + price[i] + " | Stock: " + stock[i]);
//        }
//
//        while (true) {
//            System.out.print("\nEnter product index (0-2) or -1 to finish: ");
//            int choice = sc.nextInt();
//
//            if (choice == -1)
//                break;
//
//            if (choice < 0 || choice >= product.length) {
//                System.out.println("Invalid choice!");
//                continue;
//            }
//
//            System.out.print("Enter quantity: ");
//            int qty = sc.nextInt();
//
//            if (qty > stock[choice]) {
//                System.out.println("Not enough stock!");
//                continue;
//            }
//
//            double amount = price[choice] * qty;
//            stock[choice] -= qty;
//            subtotal += amount;
//
//            System.out.println("Added: ₹" + amount);
//        }
//
//        double gstAmount = subtotal * GST / 100;
//        double total = subtotal + gstAmount;
//
//        System.out.println("\n---- BILL ----");
//        System.out.println("Subtotal: ₹" + subtotal);
//        System.out.println("GST (" + GST + "%): ₹" + gstAmount);
//        System.out.println("Total Payable: ₹" + total);
//
//        sc.close();
//    }
//}
