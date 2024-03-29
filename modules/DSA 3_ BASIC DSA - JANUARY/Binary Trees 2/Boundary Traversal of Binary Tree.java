
// Question Link -- https://course.acciojob.com/idle?question=52812c95-8480-4304-b0b2-9b73ba1ae7c8

import java.util.*;

class Node {

  int data;
  Node left, right;
}

class Solution{
    static void printBoundary(Node node)
    {
			ArrayList<Integer> list = new ArrayList<>();
	       if(node == null) return;
			if(!isLeaf(node)) list.add(node.data);
			if(node.left!=null) addLeftBoundary(node.left,list);
				addLeaves(node,list);
			if(node.right!=null) addRightBoundary(node.right,list);

			for(Integer i:list) System.out.print(i+" ");
    }
	

	static void addLeftBoundary(Node node,ArrayList<Integer> list){
			if(node==null) return;
			if(!isLeaf(node)) list.add(node.data);

			if(node.left!=null) addLeftBoundary(node.left,list);
			else addLeftBoundary(node.right,list);
			
	}
	
	static void addLeaves(Node node,ArrayList<Integer> list){
		if(node==null) return;
			if(isLeaf(node)){
				list.add(node.data);
				return;
			} 
			addLeaves(node.left,list);
			addLeaves(node.right,list);
				
	}


	static void addRightBoundary(Node node,ArrayList<Integer> list){
			if(node==null) return;
			
			if(node.right!=null) addRightBoundary(node.right,list);
			else addLeftBoundary(node.left,list);

			if(!isLeaf(node)) list.add(node.data);
			
	}
	
	static boolean isLeaf(Node node){
		return node.left==null && node.right==null;
	}
}
public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    Solution.printBoundary(root);
  }
}
