
// Question Link -- https://course.acciojob.com/idle?question=f74897ab-cbb8-4302-b031-f69c5d31c1ea

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

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
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node root = buildTree(s);
        Solution tree = new Solution();
        int ans = tree.solve(root);
        System.out.println(ans);

        sc.close();
    }
}

class Solution {

    public int solve(Node root) {
          Queue<Pair> queue = new ArrayDeque<>();
       if(root!=null) queue.offer(new Pair(root,0));
        int maxWidth = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            int width = 0;
            for(int i =0;i<size;i++){
                Pair pair = queue.poll();
                if(i==0) width = pair.num;
                if(pair.node.left!=null) queue.offer(new Pair(pair.node.left,2*pair.num-width));
                if(pair.node.right!=null) queue.offer(new Pair(pair.node.right,2*pair.num+1-width));
                if(i==size-1) width = pair.num - width + 1;
            }
           maxWidth = Math.max(width,maxWidth);
        }
        return maxWidth;
    }
}

class Pair{
    Node node;
    int num;

    Pair(Node node , int num){
        this.node=node;
        this.num=num;
    }
}
        
