package stack;

public class Main {

    public static String reverseString (String string){

        Stack<Character> stack = new Stack<>();
        String reverseString = "";

        for(char ch: string.toCharArray()){
            stack.push(ch);
        }

        while (!stack.isEmpty()){
            reverseString += stack.pop();
        }
        return reverseString;
    }

    public static boolean isBalancedParentheses(String string){
        Stack<Character> stack =  new Stack<>();

        // char[] charArray  = string.toCharArray();
        // if(charArray[0] == ')') return false;

        for(char ch: string.toCharArray()){

            if(ch == '('){
                stack.push(ch);
            } else if(ch == ')'){
                if(stack.isEmpty()|| stack.pop() != '('){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String []args){

        // reverse String
//        System.out.println("Test 1: Normal Word");
//        System.out.println("Input: 'hello'");
//        System.out.println("Expected: 'olleh'");
//        System.out.println("Actual: '" + reverseString("hello") + "'");
//        System.out.println();

        // balanced parenthesis
        System.out.println("Test 2: Single Pair");
        System.out.println("Input: '()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("()"));
        System.out.println();
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

