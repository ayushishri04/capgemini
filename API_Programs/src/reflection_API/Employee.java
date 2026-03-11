package reflection_API;
import java.lang.reflect.Field;

class EmployeeObject {
    String name = "Sumit Khanna";
    int age = 22;
    String email = "sumitkhanna@gmail.com";
}

public class Employee {
    public static void main(String[] args) throws Exception {

        EmployeeObject emp = new EmployeeObject();

        Class<?> obj = emp.getClass();
        Field[] fields = obj.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " = " + field.get(emp));
        }
    }
}