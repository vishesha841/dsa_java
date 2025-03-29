import java.util.*;

class QueueUsingTwoStacks {
    private Stack<Integer> stack1; // Input stack
    private Stack<Integer> stack2; // Output stack

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation
    public void dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            stack2.pop();
        }
    }

    // Print the front element
    public void front() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            System.out.println(stack2.peek());
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // Number of queries
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        while (q-- > 0) {
            int queryType = sc.nextInt();
            if (queryType == 1) {
                int x = sc.nextInt();
                queue.enqueue(x);
            } else if (queryType == 2) {
                queue.dequeue();
            } else if (queryType == 3) {
                queue.front();
            }
        }
        sc.close();
    }
}
