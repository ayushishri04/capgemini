package Feb6;
import java.util.Stack;

public class JVMcall {

    static Stack<String> callStack = new Stack<>();

    public static void main(String[] args) {

        methodCall("main");
        login();
        methodReturn();
    }

    static void login() {
        methodCall("login");
        validate();
        methodReturn();
    }

    static void validate() {
        methodCall("validate");
        methodReturn();
    }
    static void methodCall(String methodName) {
        callStack.push(methodName);
        printStack("CALL " + methodName);
    }
    static void methodReturn() {
        String method = callStack.pop();
        printStack(" " + method);
    }
    static void printStack(String action) {
        System.out.println(action);
        System.out.println("Call Stack: " + callStack);
    }
}
