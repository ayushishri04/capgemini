package collectionJava;
import java.util.ArrayList;
import java.util.Scanner;

public class MobileShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile holder name: ");
        String person = sc.nextLine();
        ArrayList<String> mobileList = new ArrayList<>();
        mobileList.add("Samsung");
        mobileList.add("Apple");
        mobileList.add("OnePlus");
        System.out.println("\nHello " + person + ", choose your mobile:");
        for (int i = 0; i < mobileList.size(); i++) {
            System.out.println(i + " -> " + mobileList.get(i));
        }
        System.out.print("Enter index number: ");
        int index = sc.nextInt();
        String selected = mobileList.get(index);
        System.out.println("You selected: " + selected);
        mobileList.remove(index);
        System.out.println("After removal: " + mobileList);
        System.out.println("Number of mobiles left: " + mobileList.size());

        sc.close();
    }
}
