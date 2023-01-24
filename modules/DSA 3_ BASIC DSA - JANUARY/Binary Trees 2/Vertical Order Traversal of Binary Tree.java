
// QUestion Link -- https://course.acciojob.com/idle?question=2f8ad4e6-8b0a-4ae9-ab83-843853a7dd6e

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
import java.lang.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Solution {
    List<List<Integer>> VerticalTraversal(TreeNode root) {
        
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> verticalMap = new TreeMap<>();

        createMap(root,verticalMap,0,0);

        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> horizonalMap : verticalMap.values()){
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> queue : horizonalMap.values()){
                while(!queue.isEmpty()){
                     list.add(queue.poll());
                }
               
            }
            ans.add(list);
        }
       return ans; 
    }

    // Using PreOrder Traversal
    public void createMap(TreeNode root,TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> verticalMap,int verticalLevel,int horizontalLevel){
        if(root==null) return;
        
        if(!verticalMap.containsKey(verticalLevel)){
            verticalMap.put(verticalLevel,new TreeMap<Integer,PriorityQueue<Integer>>());
        }

        if(!verticalMap.get(verticalLevel).containsKey(horizontalLevel)){
            verticalMap.get(verticalLevel).put(horizontalLevel,new PriorityQueue<Integer>());
        }
  
        verticalMap.get(verticalLevel).get(horizontalLevel).offer(root.data);
        createMap(root.left,verticalMap,verticalLevel-1,horizontalLevel+1);
        createMap(root.right,verticalMap,verticalLevel+1,horizontalLevel+1);

    }
}

class Main {

    static TreeNode buildTree(String str) {
        if(str.length()==0 || str.charAt(0)=='N')
            return null;

        String ip[] = str.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(ip[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            TreeNode currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            TreeNode root = buildTree(s);
            Solution ob = new Solution();
            List<List<Integer>> ans = ob.VerticalTraversal(root);
            for(int i = 0; i < ans.size(); i++) {
                for(int a : ans.get(i)) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            // System.out.println();
            t--;
        }
    }
}
