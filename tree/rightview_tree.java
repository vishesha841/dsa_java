import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Function to build the tree from level-order input
    void buildTree(Scanner sc) {
        String[] values = sc.nextLine().split(" "); // Read input as space-separated values
        if (values.length == 0 || values[0].equals("-1")) return;

        root = new Node(Integer.parseInt(values[0])); // Root node
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            Node current = queue.poll();

            // Left child
            if (!values[i].equals("-1")) {
                current.left = new Node(Integer.parseInt(values[i]));
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < values.length && !values[i].equals("-1")) {
                current.right = new Node(Integer.parseInt(values[i]));
                queue.offer(current.right);
            }
            i++;
        }
    }

    // Function to print the right view of the binary tree
    void rightView(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node cr = q.poll();
                if (i == size - 1)  // Last node in the current level
                    System.out.print(cr.data + " ");
                if (cr.left != null)
                    q.offer(cr.left);
                if (cr.right != null)
                    q.offer(cr.right);
            }
        }
        System.out.println();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.buildTree(sc);
        tree.rightView(tree.root);
        sc.close();
    }
}
