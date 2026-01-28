package stack;

public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }


    // Methods
    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(top == null){
            top=newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
}


/*


import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T element){
        stackList.add(element);
        return;
    }

    public T pop(){
        if (isEmpty()) {
            return null;
        } else {
            return stackList.remove(stackList.size() - 1);
        }
    }

}
*/