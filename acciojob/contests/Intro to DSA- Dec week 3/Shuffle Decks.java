
// Question Link -- https://course.acciojob.com/idle?question=0d4632ba-59a1-4644-bd9f-8ff8f9e086dc


import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node next;
    Node(int key){
        data = key;
        next = null;
    }
}

class Main{
    static Node head;
    static Node temp;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = sc.nextInt();
		head = null;
		temp = null;
		addToTheLast(a1);
		
		for(int i = 1; i < n; i++){
			int data = sc.nextInt();
			addToTheLast(data);
		}
		Solution ans = new Solution();
		Node node = ans.shuffleDeck(head);
		printList(node);
		System.out.println();
    }
    
    public static void addToTheLast(int data){
        if(head == null){
			head = new Node(data);
			temp =head;
			return ;
		}
		else{
			Node new_node = new Node(data);
			temp.next = new_node;
			temp=temp.next;
			return;		
		}
    }
    
    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

class Solution{

    public static Node shuffleDeck(Node node){

		Node slow = node, fast= node;

		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}

		Node first = node;
		Node second = reverse(slow.next);

		slow.next = null;
		while(second!=null){
			Node temp1 = first.next;
			Node temp2 = second.next;
			first.next = second;
			second.next= temp1;
			first= temp1;
			second= temp2;
		}
		return node;
    }

	public static Node reverse(Node curr){
		Node newHead = null;

		while(curr!=null){
			Node temp = curr.next;
			curr.next= newHead;
			newHead= curr;
			curr=temp;
		}
		return newHead;
	}
}

