
// Question Link -- https://course.acciojob.com/idle?question=990a7311-5449-47ed-8b8d-9d152e0ed3f8

import java.util.Scanner;

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

    public static TreeNode CreateTree(int n,int[] preOrder) {

		return createTree(preOrder,Integer.MAX_VALUE, new int[]{0});
			
    }

	public static TreeNode createTree(int[] a, int ub,int[] i){
		if(i[0]>=a.length || a[i[0]] > ub) return null;

		TreeNode root = new TreeNode(a[i[0]++]);
			root.left = createTree(a,root.val,i);
			root.right = createTree(a,ub,i);
			return root;
		
	}

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null) return;
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append("->" + node.val + "<-");
        sb.append((node.right != null ? node.right.val : "."));
        System.out.println(sb.toString());
        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = CreateTree(n,pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
