package bst;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PrintZigzag {
    private TreeNode root;

    public PrintZigzag() {
        this.root = null;
    }

    // Method to insert a new element into the binary tree
    public void insert(int data) {
        insertRec(data);
    }
    Queue<TreeNode> queue=new LinkedList<>();
    Queue<TreeNode> q2=new LinkedList<>();

    // Recursive helper method to perform the insertion
    private void insertRec(int data) {

        // If the tree is empty, create a new node and return it
        if (root == null) {
            root = new TreeNode(data);

            return;
        }

        // Insert the new node at the first available position
        if (root.left == null) {
            root.left = new TreeNode(data);
            queue.add(root.left);
        } else if (root.right == null) {
            root.right = new TreeNode(data);
            queue.add(root.right);
        } else{
            while (!queue.isEmpty()){
              TreeNode curr=queue.peek();
                if(curr.left==null){
                    curr.left=new TreeNode(data);
                    q2.add(curr.left);
                    return;
                }else if(curr.right==null){
                    curr.right=new TreeNode(data);
                    q2.add(curr.right);
                    queue.poll();

                    if(queue.isEmpty()){
                        queue=q2;
                        q2=new LinkedList<>();
                    }
                    return;
                }



            }



        }

    }

    // Method to print the tree in-order
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    // Recursive helper method to perform in-order traversal
    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }


    public void zigzagTraversal() {
        zigzagTraversal(root);
    }

    private void zigzagTraversal(TreeNode root) {

        int flag = -1;

        Stack<TreeNode> s1 = new Stack<>();
        System.out.println(root.data);
        int cdata=0;

        if (root.right != null) {
            s1.push(root.right);
            System.out.println(root.right.data);
            cdata=root.right.data;
        }
        if (root.left != null) {
            s1.push(root.left);
            System.out.println(root.left.data);
           cdata= root.left.data;
        }


        Stack<TreeNode> s2 = new Stack<>();
        while (!s1.isEmpty()) {
            TreeNode curr = s1.pop();
            cdata=curr.data;
            if (flag == -1) {
                if (curr.left != null) {
                    s2.push(curr.left);
                    System.out.println(curr.left.data);
                    cdata=curr.left.data;
                }
                if (curr.right != null) {
                    s2.push(curr.right);
                    System.out.println(curr.right.data);
                    cdata=curr.right.data;
                }

            } else {
                if (curr.right != null) {
                    s2.push(curr.right);
                    System.out.println(curr.right.data);
                    cdata=curr.right.data;
                }
                if (curr.left != null) {
                    s2.push(curr.left);
                    System.out.println(curr.left.data);
                    cdata=curr.left.data;
                }
            }
            if (s1.isEmpty()) {
                s1 = s2;
                s2 = new Stack<>();
                if (flag == -1) {
                    flag = 1;
                } else flag = -1;
            }
        }
    }



public static void main(String[]args){
        PrintZigzag tree=new PrintZigzag();

        // Insert elements into the binary tree
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(1);
        tree.insert(9);
        tree.insert(2);
        tree.insert(2);
        tree.insert(13);


        tree.zigzagTraversal();
        }
        }