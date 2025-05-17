package newpackage1;

public class Stack {

    int stackArray[];
    int size;
    int top;

    Stack(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = item;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }

    }
     int issize(){
        return top+1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        s.push(50);
        s.push(60);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(70);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.issize());
    }
}
