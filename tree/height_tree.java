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

    void buildTree(Scanner sc) {
        String[] values = sc.nextLine().split(" ");  
        if (values.length == 0 || values[0].equals("0")) return;

        root = new Node(Integer.parseInt(values[0]));  
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            Node current = queue.poll();

            if (!values[i].equals("0")) {
                current.left = new Node(Integer.parseInt(values[i]));
                queue.offer(current.left);
            }
            i++;

            if (i < values.length && !values[i].equals("0")) {
                current.right = new Node(Integer.parseInt(values[i]));
                queue.offer(current.right);
            }
            i++;
        }
    }

    int height(Node root) {
        if (root == null) return -1;  // Fix: Start height from -1 instead of 0
        return 1 + Math.max(height(root.left), height(root.right));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.buildTree(sc);
        System.out.println(tree.height(tree.root));  // Corrected height calculation
        sc.close();
    }
}
