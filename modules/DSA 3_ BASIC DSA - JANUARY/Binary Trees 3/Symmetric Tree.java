
// Question Link -- https://course.acciojob.com/idle?question=e81eafdb-0965-4651-b3a3-ac61b70ff8da

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Solution {
    public static void isSymmetrical(Node root) {
       if(root==null || isSymmetric(root.left,root.right)){
		   System.out.println("YES");
	   }else System.out.println("NO");
    }
    public static boolean isSymmetric(Node left ,Node right){
        if(left==null||right==null) return left==right;
        if(left.data!=right.data) return false;
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);

    }
}
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
            if (i >= ip.length) break;
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
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.isSymmetrical(root1);
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
