
// Question link - https://course.acciojob.com/idle?question=078031e9-9e7d-42e3-8d08-3ab2cdcc2686

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Main {
    static Node buildTree(String str){
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    
	public static void main (String[] args) throws IOException{
            Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			Node root = buildTree(s);
			Solution tree = new Solution();
			boolean result=tree.checkTree(root);
			System.out.print(result);
	}
}
  


class Solution{
   public boolean checkTree(Node root)
	{
        return root.data == root.right.data+root.left.data;
    }
}
