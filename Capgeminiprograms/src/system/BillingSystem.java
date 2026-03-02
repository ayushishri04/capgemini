package system;
import java.util.Scanner;

public class BillingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName = "Notebook";
        int price = 50;
        int stock = 100;
        String productName1 = "Pen";
        int price1 = 10;
        int stock1 = 200;
        String productName2 = "Pencil";
        int price2 = 5;
        int stock2 = 300;
        int soldQuantity = 0;
        double totalSales = 0;
        final double GST = 18.0; 
        int option;
        do {
            System.out.println("1. Product");
            System.out.println("2. Stock ");
            System.out.println("3. Billing");
            System.out.println("4. GST ");
            System.out.println("5. Sales Report");
            System.out.println("6. Exit");
            System.out.print("Enter: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Product:" + productName);
                    System.out.println("Price:" + price);
                    System.out.println("Product:" + productName1);
                    System.out.println("Price:" + price1);
                    System.out.println("Product:" + productName2);
                    System.out.println("Price:" + price2);
                    break;
                case 2:
                    System.out.println("Available: " + stock);
                    System.out.println("Available: " + stock1);
                    System.out.println("Available: " + stock2);
                    break;
                case 3:
                    System.out.print("Enter: ");
                    int quantity = sc.nextInt();
                    if (quantity <= stock) {
                        int bill = quantity * price;
                        stock -= quantity;
                        soldQuantity += quantity;
                        totalSales += bill;
                        System.out.println("Bill: " + bill);
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                case 4:
                    double gst= totalSales * GST / 100;
                    System.out.println("GST:" + GST + "%");
                    System.out.println("GST Amount on Sales: " + gst);
                    break;
                case 5:
                    System.out.println("Sold: " + soldQuantity);
                    System.out.println("Total bill" + totalSales);
                    break;
                case 6:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid option");
            }
            
        } while (option !=6);
        sc.close();
    }
}
