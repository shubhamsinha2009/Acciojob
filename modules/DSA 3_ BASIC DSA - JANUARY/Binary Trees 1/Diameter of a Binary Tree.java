
// Question Link -- https://course.acciojob.com/idle?question=87b0d2e6-d58a-4149-a832-70355e59043b

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
        System.out.println(g.diameter(root1));
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

    
    public static int diameter(Node root) {
        return heightDiameter(root).diameter;
        
    }

    public static Pair heightDiameter(Node root){
        if(root==null) return new Pair(0,0);

        Pair left = heightDiameter(root.left);
        Pair right = heightDiameter(root.right);

        int height = Math.max(left.height,right.height) + 1;
        int diameter = left.height+right.height+1;
        int maxDiameter = Math.max(diameter,Math.max(left.diameter,right.diameter));
        return new Pair(height,maxDiameter);
    }

   static class Pair{
        int height;
        int diameter;

        Pair(int height, int diameter){
            this.height = height;
            this.diameter= diameter;
        }
    }
}
