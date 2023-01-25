
// Question Link -- https://course.acciojob.com/idle?question=83be7387-e686-464e-8c8a-be5a00bf4a37

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) arr[i] = sc.next();
    int k = sc.nextInt();
    sc.close();
    BinaryTreeNode<Integer> tree = levelOrderCreateTree(arr);
    System.out.println(timeToBurnTree(tree, k));
  }

  public static int timeToBurnTree(BinaryTreeNode<Integer> root, int start) {
         HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> parents = new HashMap<>();

        // Time Complexity -- O(N) 
        // Space Complexity - O(h)
       BinaryTreeNode startNode[] = new BinaryTreeNode[1];
		 findParentAndStart(root,parents,start,startNode);
        
        HashSet<BinaryTreeNode<Integer>> seen = new HashSet<>();

        int ans[] = new int[1];

         // Time Complexity -- O(N) 
        // Space Complexity - O(n)
        burn(startNode[0],0,seen,ans,parents);

            return ans[0];
        // Total Time Complexity - O(n)
        // Total Space Complexity - O(n)
    }

    public static void burn(BinaryTreeNode<Integer> target, int k , HashSet<BinaryTreeNode<Integer>> seen , int[] ans,HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> parents){
            if(seen.contains(target)) return ;
            if(target==null){
                ans[0] = Math.max(k-1,ans[0]);
                return;
            }
            
            seen.add(target);
            BinaryTreeNode<Integer> parent = parents.get(target);

            burn(target.left,k+1,seen,ans,parents);
            burn(target.right,k+1,seen,ans,parents);
            burn(parent,k+1,seen,ans,parents);
    }


    public static void findParentAndStart(BinaryTreeNode<Integer> root , HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> parents,int start,BinaryTreeNode<Integer>[] startNode){   

			if(root.data == start) startNode[0] = root;
            if(root.left!=null){
                parents.put(root.left,root);
               findParentAndStart(root.left,parents,start,startNode);
            }

             if(root.right!=null){
                parents.put(root.right,root);
               findParentAndStart(root.right,parents,start,startNode);
                
            }


  }

  static void createTree(BinaryTreeNode<Integer> node, int i, String[] arr) {
    if (node != null) {
      if (2 * i + 1 < arr.length) {
        if (arr[2 * i + 1].equals("null")) {
          node.left = null;
        } else {
          node.left = new BinaryTreeNode<>(Integer.parseInt(arr[2 * i + 1]));
        }
        createTree(node.left, 2 * i + 1, arr);
      }
      if (2 * i + 2 < arr.length) {
        if (arr[2 * i + 2].equals("null")) {
          node.right = null;
        } else {
          node.right = new BinaryTreeNode<>(Integer.parseInt((arr[2 * i + 2])));
        }
        createTree(node.right, 2 * i + 2, arr);
      }
    }
  }

  static BinaryTreeNode<Integer> levelOrderCreateTree(String[] arr) {
    if (arr.length == 0) return null;
    BinaryTreeNode<Integer> head = new BinaryTreeNode<>(
      Integer.parseInt(arr[0])
    );
    createTree(head, 0, arr);
    return head;
  }
}

class BinaryTreeNode<T> {

  T data;
  BinaryTreeNode<T> left;
  BinaryTreeNode<T> right;

  public BinaryTreeNode(T data) {
    this.data = data;
  }
}
