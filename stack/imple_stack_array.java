import java.util.*;

public class Solution {
    static class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        public Stack(int size) {
            arr = new int[size];
            top = -1;
            capacity = size;
        }

        // Push operation
        public void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        // Pop operation
        public void pop() {
            if (top == -1) {
                return; // Ignore underflow case
            }
            top--;
        }

        // Print the stack (each element in a new line)
        public void printStack() {
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]); // Print each element on a new line
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of operations
        Stack stack = new Stack(n);  // Create a stack of size 'n'

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            
            if (operation.equals("Push")) {
                int x = sc.nextInt();
                stack.push(x);
            } else if (operation.equals("Pop")) {
                stack.pop();
            } else if (operation.equals("Print")) {
                stack.printStack();
            }
        }

        sc.close();
    }
}
