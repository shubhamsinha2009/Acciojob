
// Question Link -- https://course.acciojob.com/idle?question=0a80f2b0-70b8-4f71-85c6-761b1313dae5

import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
 static Node merge(Node x, Node y){

	 // Through Recursion 
			return mergeRecursion(x,y);

	 // Through Loops

	// return mergeLoop(x,y);
    }

	static Node mergeRecursion(Node x, Node y){

		if(x == null) return y;
		if(y == null) return x;
		
		if(x.data < y.data){
			x.next = mergeRecursion(x.next, y);
			return x;
		} else{
			y.next = mergeRecursion(x, y.next);
			return y;
		}
			
			
	}

	static Node mergeLoop(Node x,Node y){

		Node head = new Node(0);
		Node dummy = head ;

		while(x!=null && y!=null){

			if(x.data < y.data){
				dummy.next = x;
				x = x.next;
				
			}else{
				dummy.next = y;
				y= y.next;
			}

			dummy = dummy.next;
		}

		if(y!=null){
			dummy.next = y;
		}

		if(x!=null){
			dummy.next = x;
			
		}

		return head.next;
		
	}
}

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
