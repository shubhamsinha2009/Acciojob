
// Question Link -- https://course.acciojob.com/idle?question=c1c361bd-7aa2-49e7-801d-60996615cfd1

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
        Node node = new Node(Integer.parseInt(ip[0]));
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(node);
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
                
            Node currNode = queue.peek();
            queue.remove();
                
            String currdata = ip[i];
                
            if(!currdata.equals("N")) {
                    
                currNode.left = new Node(Integer.parseInt(currdata));
                queue.add(currNode.left);
            }
                
            i++;
            if(i >= ip.length)
                break;
                
            currdata = ip[i];
                
            if(!currdata.equals("N")) {
                    
                currNode.right = new Node(Integer.parseInt(currdata));
                    
                queue.add(currNode.right);
            }
            i++;
        }
        
        return node;
    }
    static void printInorder(Node node){
        if(node == null)
            return;
            
        printInorder(node.left);
        System.out.print(node.data+" ");
        
        printInorder(node.right);
    }
    
	public static void main (String[] args) throws IOException {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            String s= br.readLine();
	            Node node = buildTree(s);
	            
	            Solution tr=new Solution();
	            int sum=tr.findMaxSum(node);
	            System.out.println(sum);
	        }
	}
}

class Solution
{
    int findMaxSum(Node node){
        return maxPath(node).maxSum;

       }

    public Pair maxPath(Node node){
        
        if(node == null) return new Pair(0,Integer.MIN_VALUE);

        Pair ls =  maxPath(node.left); 
        Pair rs = maxPath(node.right);
        
        int sum = ls.sum + rs.sum + node.data ;

        int maxSum =   Math.max(sum,Math.max(ls.maxSum,rs.maxSum));

        int gainSum =   Math.max(0, node.data + Math.max(ls.sum,rs.sum));


        return new Pair(gainSum,maxSum);
    }   
}


class Pair{
    int sum ;
    int maxSum;

    Pair(int sum , int maxSum){
        this.sum = sum;
        this.maxSum = maxSum ;
    }

}
