
// Question Link -- https://course.acciojob.com/idle?question=f63487cb-c769-453d-bf4a-04609609d2b4


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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
			String s = br.readLine();
			Node root = buildTree(s);
			Solution tree = new Solution();
			ArrayList<Integer> ans = tree.bottomView(root);

            for(Integer num:ans)
            System.out.print(num+" ");

            System.out.println();
		}
	}
}
  


class Solution{
    public ArrayList <Integer> bottomView(Node root)

    {
       if(root == null) return new ArrayList<Integer>();
			Map<Integer,Integer> map = new TreeMap<>();
			Queue<Pair> queue = new ArrayDeque<>();
			queue.offer(new Pair(root,0));
			while(!queue.isEmpty()){
					int size = queue.size();
					for(int i =0;i<size;i++){
							Pair pair = queue.poll();
							Node node = pair.node;
							int level = pair.level;
							if(node.left!=null) queue.offer(new Pair(node.left,level-1));
							if(node.right!=null) queue.offer(new Pair(node.right,level+1));
							map.put(level,node.data);
					}
			}
			ArrayList<Integer> list = new ArrayList<>(map.values());
			return list;
			
    }
}

class Pair{
	Node node;
	int level;

	Pair(Node node ,int level){
		this.node = node;
		this.level = level;
	}
}
