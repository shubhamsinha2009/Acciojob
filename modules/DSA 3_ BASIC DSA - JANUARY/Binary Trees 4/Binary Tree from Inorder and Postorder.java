
// Question Link -- https://course.acciojob.com/idle?question=fead3653-183f-4eac-94cc-fee94b777e16

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class Main {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main ip = new Main();
        int T = 1;
        while (T > 0) {
            int n = sc.nextInt();
            int[] inorder = new int[n];
            int[] postorder = new int[n];
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            Solution g = new Solution();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
        sc.close();
    }
}

class Solution {
    Node buildTree(int in[], int post[], int n){

		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i=0;i<n;i++) map.put(in[i],i);
		
		return convert(map,0,n-1,0,n-1,post);
    }

	Node convert(HashMap<Integer,Integer> map ,int li , int hi,int lp,int hp,int post[]){
			if(li>hi || lp>hp) return null;

			int rootValue = post[hp];
			int ri = map.get(rootValue);
			int rl = hi - ri;

			Node root = new Node(rootValue);

			root.right = convert(map,ri+1,hi,hp-rl,hp-1,post);
			root.left = convert(map,li,ri-1,lp,hp-rl-1,post);
		// System.out.println(root.data);

		return root;
	}
}
