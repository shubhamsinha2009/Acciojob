
// Question Link -- https://course.acciojob.com/idle?question=45eae2bf-6488-4ec5-85ab-598fc10d1647

import java.util.*;

public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  // function to construct a BST from
  // its level order traversal
  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static boolean isBalanced(Node root) {
      if(root==null) return true;

            return height(root) != -1;
    }
    public static int height(Node root) {
            if(root==null) return 0;

            int ls = height(root.left);
             if(ls==-1) return -1;
            int rs = height(root.right);
             if(rs==-1) return -1;
           
            return  Math.abs(ls-rs)>1 ? -1:Math.max(ls,rs)+1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    if (isBalanced(root)) System.out.println("true"); else System.out.println(
      "false"
    );
  }
}

class Node {

  int data;
  Node left, right;
}
