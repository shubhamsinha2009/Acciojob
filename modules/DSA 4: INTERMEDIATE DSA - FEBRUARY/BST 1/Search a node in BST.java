
// Question Link --  https://course.acciojob.com/idle?question=3a25fd86-4629-49a4-ae39-abb4978e4a4d


import java.util.*;
import java.io.*;

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
    BST(Node root){
        root=root;
    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val == val)
            return root;
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    void print(Node root){
        System.out.print(root.val + " ");
        if(root.left != null){
            print(root.left);
        }
        if(root.right != null){
            print(root.right);
        }
    }
}

class Solution{
    public boolean searchNode(Node root,int k){

			while(root!=null){
				if(root.val == k) return true;
				else if(k>root.val) root = root.right;
				else root = root.left;
				
			}
		return false;
       
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        Solution obj=new Solution();
        boolean result= obj.searchNode(t.root,k);
        if(result){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        
    }
}
