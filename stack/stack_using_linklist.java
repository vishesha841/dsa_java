import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();  // Number of queries
        Stack<Integer> stack = new Stack<>();

        while (q-- > 0) {
            int queryType = sc.nextInt();

            switch (queryType) {
                case 1:  // Push
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case 2:  // Pop
                    if (stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;

                case 3:  // Top
                    if (stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;

                case 4:  // Size
                    System.out.println(stack.size());
                    break;

                case 5:  // Is Empty
                    System.out.println(stack.isEmpty() ? "true" : "false");
                    break;
            }
        }
        sc.close();
    }
}
