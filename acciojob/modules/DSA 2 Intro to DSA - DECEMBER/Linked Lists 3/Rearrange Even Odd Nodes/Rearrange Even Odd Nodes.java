
// Question Link -- https://course.acciojob.com/idle?question=120fb058-e4aa-4c50-8fd9-1bc34055d0de

import java.util.*;

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public Node rearrangeList(Node head) {

		
		Node odd = null;
		Node even = null;
		Node dummyOdd = odd;
		Node dummyEven = even;
		Node temp = head;
		

		while(temp!=null){

			if(temp.val % 2 == 0){
				if(even==null){
					even = temp;
					dummyEven = even;
				}else{
					even.next = temp;
					even = even.next;
				}
				
			}else{			
				if(odd==null){
					odd= temp;
					dummyOdd = odd;
				}else{
					
					odd.next = temp;
					odd = odd.next;
				}	

				
			}

			temp = temp.next;
		}

		if(odd == null || even == null) {
            return head;
        }
		even.next = dummyOdd;
		odd.next = null;
		return dummyEven;
		
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
      
        Solution Obj = new Solution();
        head = Obj.rearrangeList(head);
        llist.printList(head);
        sc.close();
    }
}
