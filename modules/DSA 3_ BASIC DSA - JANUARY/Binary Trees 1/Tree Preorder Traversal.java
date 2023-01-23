
// Question Link -- https://course.acciojob.com/idle?question=1212a47c-5a68-4df2-92b3-768ed753d6eb

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;

	Node(int data){
		this.data = data;
	}
}


class Solution {
    static void preBST(int arr[], int n)
    {
		Node root = constructBinaryTree(arr);
		printInPreOrder(root);

    }

	public static void printInPreOrder(Node root){
		if(root==null) return;

		System.out.print(root.data +" ");
		printInPreOrder(root.left);
		printInPreOrder(root.right);
	}


	public static Node constructBinaryTree(int arr[]){
		Node root =null;
		for(int i:arr){
			root = insertInBST(i,root);
		}
		return root;
	}

		public static Node insertInBST(int i , Node root){
			if(root==null){
				root = new Node(i);
				return root;
			}

			if(i<root.data){
				root.left = insertInBST(i,root.left);
			}else{
				root.right = insertInBST(i,root.right);
			}

			return root;
		}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.preBST(array,n);
    }
}
