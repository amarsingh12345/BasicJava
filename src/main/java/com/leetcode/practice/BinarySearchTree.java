package com.leetcode.practice;

public class BinarySearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            this.data = val;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        } else if (val < root.data) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }



    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        search(root, 1);
        if (search(root, 10)) {
            System.out.println("found");
        } else {
            System.out.println("Not Found");
        }
    }

}
