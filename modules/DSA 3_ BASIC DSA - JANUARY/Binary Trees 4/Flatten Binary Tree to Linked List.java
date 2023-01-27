
// Question Link -- https://course.acciojob.com/idle?question=1c50f3f3-002a-4f76-837e-0ce9822345e2

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
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution ob=new Solution();
                ob.flatten(root);
                printInorder(root);
                System.out.println();
                    t--;
            
        }
    }
}

class Solution
{
    public static void flatten(Node root){
        
        Node curr = root;

        while(curr!=null){

                if(curr.left!=null){
                    
                        Node prev = curr.left;

                        while(prev.right!=null){
                            prev=prev.right;
                        }        
                        prev.right = curr.right;
                        curr.right = curr.left;
                        curr.left=null;

                }

               curr=curr.right; 
        }
    }
}
