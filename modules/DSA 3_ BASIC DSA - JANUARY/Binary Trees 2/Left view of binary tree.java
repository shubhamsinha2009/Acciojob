
// Question Link - https://course.acciojob.com/idle?question=e5bc5b24-fb3f-4112-9bb0-461f44306650

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

public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        
        Solution Accio=new Solution();
        Accio.letfView(t.root);
    }
}

class Solution
{
    public static void letfView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();

       if(root!=null) queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                Node node= queue.poll();
				if(node.left!=null)  queue.offer(node.left);
				 if(node.right!=null)  queue.offer(node.right); 
                 if(list.size() == level) list.add(node.val);
            }
            level++;
        }
        
        for(Integer i:list ) System.out.print(i+" ");
    }
    
}
