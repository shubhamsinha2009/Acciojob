
// Question Link -- https://course.acciojob.com/idle?question=7b346e14-d70f-4dc0-a82f-f3c2f3da9646

import java.util.*;
import java.io.*;


public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            ll.add(x);
        }
        int toRemove = input.nextInt();
        Solution s = new Solution();
        s.remove(ll, toRemove);
        Node curr = ll.head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

 
class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
 
class Solution {
    public static void remove(LinkedList ll, int toRemove){

		// Through Loop 
		 // removeLoop(ll,toRemove);

		// Through Recursion 
		 removeRecursion(ll,toRemove);
    }

	public static void removeRecursion(LinkedList ll, int toRemove){
			ll.head = helper(ll.head ,toRemove);			
	}

	public static Node helper(Node dummy , int toRemove ){
			if(toRemove == 0){
				return dummy.next;
			}

		dummy.next = helper(dummy.next,toRemove-1);
		return dummy;
			
	}
	
	public static void removeLoop(LinkedList ll,int toRemove){
			if(ll.head==null) return;
		
		if(toRemove==0){
			ll.head = ll.head.next;
			return;
		} 

		int indx =0;
		Node temp = ll.head;
			while(indx+1 != toRemove){
				indx++;
				temp= temp.next;
			}
		
			temp.next = temp.next.next;
	} 

	
	
}
