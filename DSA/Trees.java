package JAVA_DSA;
import java.util.ArrayList;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}

public class Trees{
    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter Elements : ");
        for (int i = 0; i < 4; i++) {
            array.add(input.nextInt());
        }

        input.close();

        TreeNode root = null;
        for (int val : array) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal : ");
        inorder(root);
    }
}
