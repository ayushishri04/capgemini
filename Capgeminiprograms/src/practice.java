////call the non static readline method of the bufferreader class
////how to work with abstract classes and non static methods in java	
////->by creating an object of the class that extends the abstract class and then calling the non static method using that object.
////arraylist is the child class of linkedlist and both are the child class of list interface
////chainned method calls are used to call multiple methods on the same object in a single line of code. It is achieved by returning the current object from each method call, allowing for method chaining. For example, in the case of ArrayList, you can chain methods like add(), remove(), and clear() to perform multiple operations on the same ArrayList object in a single line of code.
//import java.io.*;
//
//public class practice {
//
//    public static void main(String[] args) throws IOException {
////		Reader reader = new Reader();//cannot instantiate the reader class because it is an abstract class and the readline method is a non static method so we cannot call it without creating an object of the class
//
//        try {
//            FileReader fileReader = new FileReader("Student");
//        } catch (Exception e) {
//            System.out.println("File not found");
//        }
//
//        InputStream input1 = System.in;
//        InputStreamReader input = new InputStreamReader(input1);
//
//        BufferedReader reader1 = new BufferedReader(input);
//
//        String line = reader1.readLine();
//    }
//}
