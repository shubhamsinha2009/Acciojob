
// Question Link -- https://course.acciojob.com/idle?question=2f242f0c-3aed-42a0-a92f-65113c853215

import java.util.Scanner;
import java.util.LinkedList;
import java.util.*;

public class Main {
  public static Scanner scn = new Scanner(System.in);
  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int val) {
      this.val = val;
    }
  }

  public static class BSTIterator {
	  TreeNode cur ,next;
	  
    public BSTIterator(TreeNode root) {
	      cur = root;
    }
    public int next() {

		nextInorder();
		return next.val;
			
    }
    public boolean hasNext() {
	      return cur!=null;
    }

	  public void nextInorder(){

		  while(cur!=null){

				  if(cur.left!=null){
						TreeNode p = cur.left;
						while(p.right!=null && p.right!=cur){
							p=p.right;
						}

						  if(p.right!=null){
							  p.right=null;
							  next=cur;
							  cur=cur.right;
								 return;							  
						  }else{
							  p.right = cur;
							  cur=cur.left;
						  }
				  }else{
					  next=cur;
						cur=cur.right;
					  return;
				  }
		  }
		
	  }
  }

  public static void display(TreeNode node) {
    if (node == null)
      return;
    StringBuilder sb = new StringBuilder();
    sb.append((node.left != null ? node.left.val : "."));
    sb.append(" -> " + node.val + " <- ");
    sb.append((node.right != null ? node.right.val : "."));
    System.out.println(sb.toString());
    display(node.left);
    display(node.right);

  }

  public static TreeNode constructFromInOrder_(int[] in, int si, int ei) {
    if (si > ei)
      return null;
    int mid = (si + ei) / 2;
    TreeNode node = new TreeNode(in[mid]);
    node.left = constructFromInOrder_(in, si, mid - 1);
    node.right = constructFromInOrder_(in, mid + 1, ei);
    return node;
  }

  public static void solve() {
    int n = scn.nextInt();
    int[] in = new int[n];
    for (int i = 0; i < n; i++)
      in[i] = scn.nextInt();
    TreeNode root = constructFromInOrder_(in, 0, in.length - 1);
    BSTIterator itr = new BSTIterator(root);
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }

  public static void main(String[] args) {
    solve();
  }
}

