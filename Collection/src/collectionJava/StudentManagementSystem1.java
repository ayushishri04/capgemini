//package collectionJava;
//
//import java.util.*;
//
//class Student {
//
//    String name;
//    String password;
//    boolean studyMaterialAccess;
//    int sem1, sem2, sem3, sem4;
//
//    // Constructor
//    Student(String name, String password, boolean access) {
//        this.name = name;
//        this.password = password;
//        this.studyMaterialAccess = access;
//
//        Random r = new Random();
//        sem1 = r.nextInt(101);
//        sem2 = r.nextInt(101);
//        sem3 = r.nextInt(101);
//        sem4 = r.nextInt(101);
//    }
//
//    int getTotal() {
//        return sem1 + sem2 + sem3 + sem4;
//    }
//}
//
//public class StudentManagementSystem1 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // ✅ ONLY Map and Set used
//        Map<String, Student> studentMap = new HashMap<>();
//        Set<String> usernames = new HashSet<>();
//
//        int choice;
//
//        do {
//            System.out.println("\n===== MENU =====");
//            System.out.println("1. Register");
//            System.out.println("2. Login");
//            System.out.println("3. Total Students");
//            System.out.println("4. Exit");
//            System.out.print("Choose: ");
//
//            choice = sc.nextInt();
//            sc.nextLine();
//
//            switch (choice) {
//
//                // ---------------- REGISTER ----------------
//                case 1:
//
//                    System.out.print("Enter username: ");
//                    String name = sc.nextLine();
//
//                    if (usernames.contains(name)) {
//                        System.out.println("❌ Username already exists!");
//                        break;
//                    }
//
//                    System.out.print("Create password: ");
//                    String pass = sc.nextLine();
//
//                    System.out.println("Study Material Access:");
//                    System.out.println("1. Allow");
//                    System.out.println("2. Deny");
//
//                    int op = sc.nextInt();
//                    boolean access = (op == 1);
//
//                    Student s = new Student(name, pass, access);
//
//                    studentMap.put(name, s);
//                    usernames.add(name);
//
//                    System.out.println("✅ Registration Successful!");
//                    break;
//
//                // ---------------- LOGIN ----------------
//                case 2:
//
//                    System.out.print("Enter username: ");
//                    String loginName = sc.nextLine();
//
//                    System.out.print("Enter password: ");
//                    String loginPass = sc.nextLine();
//
//                    Student st = studentMap.get(loginName);
//
//                    if (st != null && st.password.equals(loginPass)) {
//
//                        System.out.println("\n✅ Login Success");
//
//                        if (st.studyMaterialAccess)
//                            System.out.println("PDF Opened 📄");
//                        else
//                            System.out.println("Access Denied ❌");
//
//                        System.out.println("\nMarks:");
//                        System.out.println("Sem1: " + st.sem1);
//                        System.out.println("Sem2: " + st.sem2);
//                        System.out.println("Sem3: " + st.sem3);
//                        System.out.println("Sem4: " + st.sem4);
//
//                        System.out.println("Total: " + st.getTotal());
//
//                    } else {
//                        System.out.println("❌ Invalid credentials");
//                    }
//                    break;
//
//                // ---------------- SIZE ----------------
//                case 3:
//                    System.out.println("Total Students: " + studentMap.size());
//                    break;
//
//                // ---------------- EXIT ----------------
//                case 4:
//                    System.out.println("Goodbye 👋");
//                    break;
//
//                default:
//                    System.out.println("Invalid option");
//            }
//
//        } while (choice != 4);
//
//        sc.close();
//    }
//}
