
// Question Link -- https://course.acciojob.com/idle?question=23641143-b9cd-45e0-b16b-80b9db53ca42


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
       // System.out.print(str);
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
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    Scanner sc = new Scanner(System.in);
            
			String s = sc.nextLine();
            //String s1 = sc.nextLine();
            

			Node root1 = buildTree(s);
            //Node root2 = buildTree(s1);
			Solution tree = new Solution();
			ArrayList<Integer>  ans = tree.reverseLevelOrder(root1);
            for(int i = 0 ; i < ans.size() ; ++i){
                System.out.print(ans.get(i)+" ");
            }
		
	}
}
  


class Solution{
    
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
          Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(root!=null) queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();
     
            for(int i =0;i<n;i++){
                Node temp = queue.poll();
				 if(temp.right!=null) queue.offer(temp.right);
                    if(temp.left!=null) queue.offer(temp.left);   
	                list.add(temp.data);
            }
           
        }

        Collections.reverse(list);
        return list;
    }
    
}

