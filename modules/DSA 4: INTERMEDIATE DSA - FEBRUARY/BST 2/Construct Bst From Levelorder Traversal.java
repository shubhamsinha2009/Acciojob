
// Question Link -- https://course.acciojob.com/idle?question=78d88a42-f9ae-4454-a580-518034855d54

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
import java.lang.*;

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

public class Main {

    static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Node ans = Obj.bstFromLevel(arr, n);
        printLevelOrder(ans);
        sc.close();
    }
}

class Solution {
    Node bstFromLevel(int arr[], int n) {

		Queue<Data> queue = new LinkedList<>();

		Node root = new Node(arr[0]);
		queue.offer(new Data(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
		int index = 1;

		while(!queue.isEmpty()){

			int size = queue.size();

			for(int i =0;i<size;i++){
				Data pop = queue.poll();
				if(index <n && arr[index]> pop.lb && arr[index] < pop.node.data ){
					pop.node.left = new Node(arr[index++]);
					queue.offer(new Data(pop.node.left,pop.lb,pop.node.data));
				}
				if(index<n && arr[index]> pop.node.data && arr[index] < pop.ub){
					pop.node.right = new Node(arr[index++]);
					queue.offer(new Data(pop.node.right,pop.node.data,pop.ub));
				}
				
			}
				
		}
		return root;
    }
}

class Data{
	Node node ;
	int lb;
	int ub;

	Data(Node node, int lb,int ub){
		this.node = node;
		this.lb= lb;
		this.ub = ub;
	}
}
