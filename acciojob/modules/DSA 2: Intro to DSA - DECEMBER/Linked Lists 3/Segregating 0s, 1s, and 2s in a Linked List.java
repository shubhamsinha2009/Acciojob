
// Question Link -- https://course.acciojob.com/idle?question=2fbcf4ac-1f98-4124-abda-0c68a640f1e9

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
    static void unfold(Node head)
    {

	// Time Complexity -- O(n)
	// Space Complexity - O(1)
		
		// variable(head);

	// Time Complexity -- O(n)
	// Space Complexity - O(1)	

		pointers(head);
		
    }

	static void pointers(Node head){
		Node dummy0 = new Node(0);
		Node dummy1 = new Node(1);
		Node dummy2 = new Node(2);

		Node temp0 = dummy0;
		Node temp1 = dummy1;
		Node temp2 = dummy2;

		Node temp = head ;

		while(temp!=null){

			if(temp.data == 0){
				temp0.next = temp;
				temp0 = temp0.next; 
			}else if(temp.data == 1){
				temp1.next = temp;
				temp1 = temp1.next; 
			}else{
				temp2.next = temp;
				temp2 = temp2.next; 
			}

			temp = temp.next;
		}

		temp0.next = dummy1.next;
		temp1.next = dummy2.next;
		temp2.next = null;

		printLL(dummy0.next);
		
	}
	
	static void variable(Node head){
		int count[] = new int[3];
		Node temp = head;
		
		while(temp!=null){

			count[temp.data]++ ;
			temp = temp.next;
			
		}
		
		Node dummy2= new Node(0);
		Node dummy = dummy2;

		while(count[0] != 0){
			count[0]--;
			Node temp2 = new Node(0);
			dummy.next = temp2;
			dummy = dummy.next;
		}
		while(count[1] != 0){
			count[1]--;
			Node temp2 = new Node(1);
			dummy.next = temp2;
			dummy = dummy.next;
		}
		while(count[2] != 0){
			count[2]--;
			Node temp2 = new Node(2);
			dummy.next = temp2;
			dummy = dummy.next;
		}

		printLL(dummy2.next);
	}

	static void printLL(Node head){
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
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
        Ob.unfold(l1.head);
    }
}
