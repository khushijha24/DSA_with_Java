package stack;

public class Main {
    public static void main(String []args){

        Stack myStack = new Stack(4);

        myStack.printAll();
    }
}

/*
public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack;

        // Test 1: Push single element
        System.out.println("Test 1: Push Single Element");
        stack = new Stack<>();
        stack.push(10);
        System.out.println("Expected Stack (top to bottom): 10");
        System.out.println("Actual Stack:");
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println();

    }

    }

 */

