
// Question Link -- https://course.acciojob.com/idle?question=c6498862-1ab7-4ec9-b662-7db2be3ee49c

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node() {

    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }
}

class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }

}

class Solution {

    public void printSingleChildNodes(Node root, Node parent) {
		if(root==null) return ;
		if(root.left == null&& root.right==null) return ;

		if(root.left==null){
			System.out.print(root.right.data+" ");
		}
		if(root.right==null){
			System.out.print(root.left.data+" ");
		}

		printSingleChildNodes(root.left,parent);
		printSingleChildNodes(root.right,parent);
		
    }

}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }
        Node root = new Node();
        root = root.construct(arr);
        Solution obj = new Solution();
        obj.printSingleChildNodes(root, null);
    }
}
