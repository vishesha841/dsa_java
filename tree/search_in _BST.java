import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Solution {
    
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    } 
    public static boolean search(TreeNode root, int k) {
        if (root == null) return false;
        if (root.val == k) return true;
        return k < root.val ? search(root.left, k) : search(root.right, k);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();           
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }        
        int k = sc.nextInt();      
        System.out.println(search(root, k));
        
     
    }
}
