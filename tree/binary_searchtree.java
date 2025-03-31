import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root = null;

    void build() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();  // Corrected Scanner method

        if (data == -1) return;  // Proper break condition

        root = new Node(data);
        Queue<Node> q = new LinkedList<>();  // Corrected Queue instantiation
        q.offer(root);

        while (!q.isEmpty()) {  // Corrected method call
            Node currentNode = q.poll();

            int leftData = sc.nextInt();
            if (leftData != -1) {
                currentNode.left = new Node(leftData);
                q.offer(currentNode.left);
            }

            int rightData = sc.nextInt();
            if (rightData != -1) {
                currentNode.right = new Node(rightData);
                q.offer(currentNode.right);
            }
        }
        sc.close();
    }

    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

public class Main {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();  // Corrected instantiation
        tree.build();
        tree.inorder(tree.root);
    }
}
