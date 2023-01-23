
// Question Link -- https://course.acciojob.com/idle?question=b630c0be-f168-423f-9d7a-f3c4acfc36e6

import java.io.*;
import java.util.*;

class Node{
	int data ;
	Node left ;
	Node right;

	Node(int data){
		this.data= data;
	}
}
public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node root = createTree(n,sc);

		printLevelOrder(root);
		
    }

	public static void printLevelOrder(Node root){

		Queue<Node> queue = new LinkedList<>();

		queue.offer(root);

			while(!queue.isEmpty()){
				Node node = queue.poll();
				System.out.print(node.data +" ");

				if (node.left!=null) queue.offer(node.left);
				if (node.right!=null) queue.offer(node.right);
	
			}
		
	}

	public static Node insert(Node root, int data){
		if(root==null) return new Node(data);

			 if(data<root.data){
				 root.left = insert(root.left,data);
			 }else{
				 root.right = insert(root.right,data);
			 }

		return root;
	}

	public static Node createTree(int n, Scanner sc){
				Node root = null;
			for(int i =0;i<n;i++){
				 root = insert(root,sc.nextInt());
			}
			return root;
	}
}
