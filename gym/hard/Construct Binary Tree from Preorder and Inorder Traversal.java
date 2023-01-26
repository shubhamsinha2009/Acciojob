
// Question Link -- https://course.acciojob.com/idle?question=73dc7bdc-712a-4d18-b043-4a23ff720e30

import java.util.*;
import java.io.*;
class Node{
    int data; 
    Node left, right;
    Node(int key){
        data = key;
        left = right = null;
    }
}

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        int inorder[] = new int[n];
        int preorder[] = new int[n];
        for(int i = 0; i < n; i++)
          preorder[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
          inorder[i] = sc.nextInt();
        Solution ob = new Solution();
        root = ob.buildTree(inorder, preorder, n);
        postOrdrer(root);
        System.out.println();
    }
    
    public static void postOrdrer(Node root){
        if(root == null)
          return;
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}


class Solution{
    public static Node buildTree(int inorder[], int preorder[], int n){
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);

      return construct(map,0,preorder.length-1,0,inorder.length-1,preorder);
        
    }

    public static Node construct(HashMap<Integer,Integer> map,int lowInorder,int highInorder ,int lowPreorder ,int highPreorder,int[] preorder){

            if(lowInorder>highInorder || lowPreorder>highPreorder) return null;
        int rootVal = preorder[lowPreorder];

        int rootIndexInorder = map.get(rootVal);
        
        Node root = new Node(rootVal);

        root.left = construct(map,lowInorder,rootIndexInorder-1,lowPreorder+1,lowPreorder+rootIndexInorder-lowInorder,preorder);
        root.right = construct(map,rootIndexInorder+1,highInorder,lowPreorder+rootIndexInorder-lowInorder+1,highPreorder,preorder);
        return root; 
    }
}
