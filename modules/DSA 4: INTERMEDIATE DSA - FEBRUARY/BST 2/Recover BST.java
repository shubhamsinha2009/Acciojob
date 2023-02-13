
// Question Link - https://course.acciojob.com/idle?question=5c814944-2552-47b2-999d-e85df0cba97f

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

    public static void recoverTree(TreeNode root) {

			TreeNode cur = next(root);

			TreeNode a =null,b=null;

			while(cur!=null){
				TreeNode prev = cur;
				cur = next(prev.right);

				if(cur!=null){
					if(prev.val > cur.val){
						if(a==null) a = prev;
						b = cur;
					}
				}
			}

		// swap 

			if(a!=null && b!=null){
				int temp = a.val;
				a.val = b.val;
				b.val = temp;
			}
		
    }

	public static TreeNode next(TreeNode cur){

		while(cur!=null){
				if(cur.left!=null){
						TreeNode p = cur.left;
						while(p.right!=null && p.right!=cur){
							p=p.right;
						}

						if(p.right!=null){
							p.right=null;
							return cur;
						}else{
							p.right=cur;
							cur=cur.left;
						}
				}else{
					return cur;
				}
		}
		return null;
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
        recoverTree(root);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
