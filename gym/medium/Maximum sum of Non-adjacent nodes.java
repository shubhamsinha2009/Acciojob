
// Question Link - https://course.acciojob.com/idle?question=2c12f828-161e-4ca0-868e-b0ce48d835d9

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length)
                break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Node root = buildTree(s);
        Solution g = new Solution();
        sc.close();
        int ans = g.getMaxSum(root);
        System.out.println(ans);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    public int getMaxSum(Node root) {

		HashMap<Node,Integer> map = new HashMap<>();
		
		return h(root,map);
    }
	public int h(Node root ,HashMap<Node,Integer> map){
		if(root == null) return 0;

		if(map.containsKey(root)) return map.get(root);
		int inc = root.data ;

		if(root.left!=null){
			inc += h(root.left.left,map);
			inc += h(root.left.right,map);
		}

		if(root.right!=null){
			inc+= h(root.right.left,map);
			inc+= h(root.right.right,map);
		}

		int exc = h(root.left,map) + h(root.right,map);

			int max = Math.max(inc , exc);
				map.put(root,max);
				return max;
	}
}
