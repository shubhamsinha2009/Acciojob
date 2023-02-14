
// Question Link -- https://course.acciojob.com/idle?question=5c0ae439-fa35-402f-8d94-5a47056b7131

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

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if(root==null) return "#";
	return String.valueOf(root.val) + " " + serialize(root.left)+" "+ serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String str) {
		String s[] = str.split(" ");
			return deserialize(s,0).node;
		
    }

	 public static Pair deserialize(String[] s , int i) {
			if(s[i].equals("#")) return new Pair(i,null);

			 TreeNode root = new TreeNode(Integer.parseInt(s[i]));

			 Pair p = deserialize(s,i+1);
				root.left = p.node;
			Pair q = deserialize(s,p.index+1);
				 root.right = q.node;

			 return new Pair(q.index,root);
    }

	static class Pair{
		int index;
		TreeNode node;
		Pair(int index , TreeNode node){
			this.index = index;
			this.node=node;
		}
	}
    // input_section=================================================

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

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }
        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);

        String s = serialize(root);
        display(deserialize(s));
    }

    public static void main(String[] args) {
        solve();
    }
}
