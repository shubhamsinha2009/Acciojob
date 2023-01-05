
// Question Link - https://course.acciojob.com/idle?question=87e0d4e3-e18e-46bd-bccf-7c3409344674

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
    
    static void rotateRight(Node head, int k) {
     if(head==null || k==0 || head.next == null ) return;
        Node tail = head ;
        int length = 1;
        while(tail.next!=null){
            length++;
            tail=tail.next;
        }
      
        tail.next = head;

        k%=length;
        k = length - k;
 
       
        while(k>0){
            tail=tail.next;
            k--;
        }

        head= tail.next; 
        tail.next = null;

		printLL(head);
        
    }

	static void printLL(Node head){
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
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
        Solution Ob = new Solution();
        int k = sc.nextInt();
        Ob.rotateRight(l1.head, k);
    }
}
