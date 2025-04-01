import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {

    // Function to build the binary tree from level-order input
    public static Node buildTree(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) return null;

        Node root = new Node(val);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new Node(leftVal);
                queue.offer(current.left);
            }

            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new Node(rightVal);
                queue.offer(current.right);
            }
        }
        return root;
    }

    // Function to print nodes that have exactly one child
    public static void printSingleChildNodes(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node current = q.poll();

            if (current.left != null && current.right == null)
                System.out.print(current.left.data + " ");
            if (current.right != null && current.left == null)
                System.out.print(current.right.data + " ");

            if (current.left != null) q.offer(current.left);
            if (current.right != null) q.offer(current.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Build the tree from input
        Node root = buildTree(sc);

        // Print nodes that have exactly one child
        printSingleChildNodes(root);

        sc.close();
    }
}
