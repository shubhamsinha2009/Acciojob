
// Question Link -- https://course.acciojob.com/idle?question=014a1af9-7d87-4ffb-9762-2ae93a586073

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
    public void partition(Node head, int x) {

		Node temp = head ;
		Node lessStart = null;
		Node moreStart = null;
		Node lessEnd =null;
		Node moreEnd =null;

		while(temp!=null){
			
			if(temp.data < x){

				if(lessEnd == null){
					lessStart = temp;
					lessEnd = temp;
				}else{
					lessEnd.next = temp;
					lessEnd = lessEnd.next;
				}	
			}else{

				if(moreEnd == null){
					moreStart = temp;
					moreEnd = temp;
				}else{
					moreEnd.next = temp;
					moreEnd = moreEnd.next;
				}
				
			}

			temp = temp.next;
		}

		lessEnd.next = moreStart;
		moreEnd.next = null;

		printLL(lessStart);
    }

	 public static void printLL(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
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
        int x = sc.nextInt();
        Solution Ob = new Solution();
        Ob.partition(l1.head, x);
    }
}
