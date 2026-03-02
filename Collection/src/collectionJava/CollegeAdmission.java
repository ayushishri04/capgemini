package collectionJava;
import java.util.ArrayList;
import java.util.Scanner;
public class CollegeAdmission {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int option;
            do {
                System.out.println("1. Add");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.print("Enter option: ");
                option = sc.nextInt();
                sc.nextLine();
                if (option == 1) {
                    System.out.print("Enter name: ");
                    list.add(sc.nextLine());
                    System.out.println("Added");
                }
                else if (option == 2) {
                    System.out.print("Enter index");
                    int i = sc.nextInt();
                    sc.nextLine();
                    if (i >= 0 && i < list.size()) {
                        System.out.print("Enter");
                        list.set(i, sc.nextLine());
                        System.out.println("Updated");
                    }
                }
                else if (option == 3) {
                    System.out.print("Enter index");
                    int i = sc.nextInt();
                    if (i >= 0 && i < list.size()) {
                        list.remove(i);
                        System.out.println("Deleted");
                    }
                }
            } while (option!=3);
            sc.close();
	}
}
