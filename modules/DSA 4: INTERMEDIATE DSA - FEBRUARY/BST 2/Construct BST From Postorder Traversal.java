
// Question Link --  https://course.acciojob.com/idle?question=3f0008d8-5316-4ffb-a3f1-cdb5372a6590

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


    public static TreeNode CreateTree(int n,int[] postOrder) {
        return createTree(postOrder,Integer.MIN_VALUE,new int[]{n-1});
    }

	public static TreeNode createTree(int[] a,int lb,int[] i){
		if(i[0]<0 || a[i[0]] < lb ) return null;

			TreeNode root = new TreeNode(a[i[0]--]);

		root.right = createTree(a,root.val,i);
		root.left = createTree(a,lb,i);
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
        int[] post = new int[n];
        for (int i = 0; i < n; i++)
            post[i] = scn.nextInt();

        TreeNode root = CreateTree(n,post);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
