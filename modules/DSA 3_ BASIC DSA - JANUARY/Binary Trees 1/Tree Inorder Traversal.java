
// Question link -- https://course.acciojob.com/idle?question=1212a47c-5a68-4df2-92b3-768ed753d6eb

import java.io.*;
import java.util.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BST{
    Node root = null;
    BST(){

    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

class Solution{
public static void traversal(Node curr, BST t){
   printInOrder(curr);
}
	
		public static void printInOrder(Node root){
		if(root==null) return;
		printInOrder(root.left);
		System.out.print(root.val +" ");
		printInOrder(root.right);
	}
}
public class Main {
       public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        Solution Obj = new Solution();
        Obj.traversal(t.root, t);
    }
}
