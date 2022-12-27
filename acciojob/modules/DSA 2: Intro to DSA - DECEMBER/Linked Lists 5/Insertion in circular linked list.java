
// Question Link -- https://course.acciojob.com/idle?question=f04cbc4e-9a17-4302-8430-6b9f84ecbcb5

import java.util.*;
import java.io.*;

class Node{
	int data ;
	Node next;
	Node(int data){
		this.data = data;
		next=null;
	}
}

class CircularLinkedList{
	Node head;
	Node tail;

	CircularLinkedList(){
		head=null;
		tail=null;
	}

	void add(int data){
		Node node = new Node(data);

		if(head==null && tail==null){
			head = node;
			tail=node;
			node.next = head;
		}else{
			tail.next = node;
			tail = node ;
			tail.next = head ;
			
		}
	}

	void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else { 
             do{
                System.out.print(current.data+" ");  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		CircularLinkedList  cll = new CircularLinkedList();

			for(int i = 0; i<n;i++){
				cll.add(sc.nextInt());
			}

		int k = sc.nextInt();
			Solution.insertAtEnd(cll.tail,k);
		cll.display();
		
    }
}

class Solution{
  static void insertAtEnd(Node tail , int val){
			Node node = new Node(val);
			node.next = tail.next;
			tail.next = node;
			tail = node ;
  }		
		
}
