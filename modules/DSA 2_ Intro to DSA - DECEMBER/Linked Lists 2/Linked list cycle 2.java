
// Question Link -- https://course.acciojob.com/idle?question=6db52d7a-4879-482e-b702-e7f8fcd06331

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class Main
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = sc.nextInt();
        Node head = new Node(num);
        Node tail = head;
        
        for(int i=0; i<n-1; i++)
        {
            num = sc.nextInt();
            tail.next = new Node(num);
            tail = tail.next;
        }
        
        int pos = sc.nextInt();
        makeLoop(head, tail, pos);
        
        Solution x = new Solution();
        Node y = x.detectLoop(head); 
        if( y == null )
            System.out.println(0);
        else
            System.out.println(y.data);
    }
}

class Solution {
    public static Node detectLoop(Node head){

		// HashSet Solution 
		// Time Complexity - O(n)
		// Space Complexity - O(n)

		// return hashSol(head);

		// Two Pointer Solution 
		// Time Complexity - O(n)
		// Space Complexity - O(1)

		return twoPointers(head);
        
    }

	public static Node twoPointers(Node head){

		Node slow = head,fast=head;

		while(fast.next!=null && fast.next.next !=null){
			slow=slow.next;
			fast = fast.next.next;

			if(slow==fast){
				fast = head;
					while(fast!=slow){
						fast = fast.next;
						slow= slow.next;
					}
				return slow;
			}
		}
		return null;
		
	}

	public static Node hashSol(Node head){
		 HashSet<Node> set= new HashSet<>();

        while(head!=null && set.add(head)){

            head= head.next;
        } 

        return head;    
	}
}
