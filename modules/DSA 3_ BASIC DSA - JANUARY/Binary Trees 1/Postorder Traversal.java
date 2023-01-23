
// Question Link -- https://course.acciojob.com/idle?question=ac1af0fe-d5d6-4279-b47c-9787423ab256

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
       printPostOrder(curr);
    }
	public static void printPostOrder(Node root){
		if(root==null) return;
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.val +" ");
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
