
// Question Link -- https://course.acciojob.com/idle?question=be39b348-4f5f-4a01-8f8f-adceb17804d2


import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Main {
    static Node buildTree(String str){
       // System.out.print(str);
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;   
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    Scanner sc = new Scanner(System.in);
            
			String s = sc.nextLine();
            int n = sc.nextInt();
		    int K = sc.nextInt();
            //System.out.print(s);
			Node root = buildTree(s);
			Solution tree = new Solution();
			ArrayList<Integer> ans = tree.KDistanceNodes(root,n,K);
            Collections.sort(ans);
			for(int i = 0 ; i < ans.size() ; ++i){
                System.out.print(ans.get(i) + " ");
            }
		
	}
}
  


class Solution{
    
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        HashMap<Node,Node> parents = new HashMap<>();

        // Time Complexity -- O(N) 
        // Space Complexity - O(h)

		Node[] t = new Node[1];
        findParent(root,parents,t,target);
        
        HashSet<Node> seen = new HashSet<>();

        ArrayList<Integer> ans = new ArrayList<>();

         // Time Complexity -- O(N) 
        // Space Complexity - O(k)
        findDistanceK(t[0],k,seen,ans,parents);

            return ans;
        // Total Time Complexity - O(n)
        // Total Space Complexity - O(max(k,h))
    }

    public static void findDistanceK(Node target, int k , HashSet<Node> seen , ArrayList<Integer> ans,HashMap<Node,Node> parents){
            if(target==null || seen.contains(target)) return ;
            if(k==0){
                ans.add(target.data);
                return;
            }
            
            seen.add(target);
            Node parent = parents.get(target);

            findDistanceK(target.left,k-1,seen,ans,parents);
            findDistanceK(target.right,k-1,seen,ans,parents);
            findDistanceK(parent,k-1,seen,ans,parents);
    }


    public static void findParent(Node root , HashMap<Node,Node> parents ,Node[] t,int target){   

		if(root.data== target) t[0] = root;
            if(root.left!=null){
                parents.put(root.left,root);
                findParent(root.left,parents,t,target);
            }

             if(root.right!=null){
                parents.put(root.right,root);
                findParent(root.right,parents,t,target);
                
            }
    }
    
}

