import java.util.*;

/* ---------------- PRODUCT CLASS ---------------- */
class Product {
    int id;
    String name;
    double price;
    double gst;
    int stock;

    Product(int id, String name, double price, double gst, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gst = gst;
        this.stock = stock;
    }

    public String toString() {
        return id + " | " + name + " | ₹" + price + " | GST: " + gst + "% | Stock: " + stock;
    }
}

/* ---------------- BILL ITEM ---------------- */
class BillItem {
    String name;
    int qty;
    double total;

    BillItem(String name, int qty, double total) {
        this.name = name;
        this.qty = qty;
        this.total = total;
    }
}

/* ---------------- MAIN SYSTEM ---------------- */
public class system {

    static HashMap<Integer, Product> products = new HashMap<>();
    static List<Double> sales = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    /* ---------- ADD PRODUCT ---------- */
    static void addProduct() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("GST %: ");
        double gst = sc.nextDouble();

        System.out.print("Stock: ");
        int stock = sc.nextInt();

        products.put(id, new Product(id, name, price, gst, stock));

        System.out.println("✅ Product Added!");
    }

    /* ---------- VIEW PRODUCTS ---------- */
    static void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products.values()) {
            System.out.println(p);
        }
    }

    /* ---------- ADD STOCK ---------- */
    static void addStock() {
        System.out.print("Product ID: ");
        int id = sc.nextInt();

        Product p = products.get(id);

        if (p == null) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Add Quantity: ");
        int qty = sc.nextInt();

        p.stock += qty;

        System.out.println("Stock Updated!");
    }

    /* ---------- CREATE BILL ---------- */
    static void createBill() {

        List<BillItem> cart = new ArrayList<>();
        double grandTotal = 0;

        while (true) {
            System.out.print("Enter Product ID (0 to finish): ");
            int id = sc.nextInt();

            if (id == 0)
                break;

            Product p = products.get(id);

            if (p == null) {
                System.out.println("Product not found!");
                continue;
            }

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            if (qty > p.stock) {
                System.out.println("Not enough stock!");
                continue;
            }

            double subtotal = p.price * qty;
            double gstAmount = subtotal * p.gst / 100;
            double total = subtotal + gstAmount;

            p.stock -= qty;

            cart.add(new BillItem(p.name, qty, total));
            grandTotal += total;
        }

        /* ----- PRINT BILL ----- */
        System.out.println("\n===== BILL =====");
        for (BillItem item : cart) {
            System.out.println(item.name + " x " + item.qty + " = ₹" + item.total);
        }
        System.out.println("TOTAL = ₹" + grandTotal);
        System.out.println("================");

        sales.add(grandTotal);
    }

    /* ---------- SALES REPORT ---------- */
    static void salesReport() {
        double sum = 0;

        for (double s : sales)
            sum += s;

        System.out.println("Total Bills: " + sales.size());
        System.out.println("Total Revenue: ₹" + sum);
    }

    /* ---------- MAIN MENU ---------- */
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== INVENTORY BILLING SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add Stock");
            System.out.println("4. Create Bill");
            System.out.println("5. Sales Report");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: addProduct(); break;
                case 2: viewProducts(); break;
                case 3: addStock(); break;
                case 4: createBill(); break;
                case 5: salesReport(); break;
                case 6: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
