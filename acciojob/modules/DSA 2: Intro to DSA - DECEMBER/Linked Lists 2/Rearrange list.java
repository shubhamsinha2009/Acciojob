
// Question Link -- https://course.acciojob.com/idle?question=78bdc5f3-b1ba-4063-a99b-38413ac59785

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
        int t = sc.nextInt();
        
        while(t-- > 0){
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
            Node node = ans.rearrange(head);
            printList(node);
            System.out.println();
        }
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

    public static Node rearrange(Node node){

		Node preMiddle = midpointOfLinkedList(node);
		Node middle = preMiddle.next;
		preMiddle.next = null;

		middle = reverse(middle);

		return merge(node,middle);
       
    }

	public static Node merge(Node head,Node middle){
			Node dummy = head;
		while(dummy!=null && middle!=null){
			Node temp = middle.next;
			middle.next = dummy.next;
			dummy.next = middle;
			middle = temp;
			dummy= dummy.next.next;
		}
		return head;
	}
	

	public static Node reverse(Node head){
		Node newHead = null;

		while(head!=null){
			Node temp = head.next;
			head.next = newHead;
			newHead = head;
			head= temp;
		}
		return newHead;
	}

	public static Node midpointOfLinkedList(Node head)
    {
		if(head==null) return null;

       Node slow = head, fast = slow;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}

