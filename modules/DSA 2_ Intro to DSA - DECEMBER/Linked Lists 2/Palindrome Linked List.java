
// Question Link -- https://course.acciojob.com/idle?question=4d529a8f-2016-4c69-9c8a-61329815420a

import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
            
        Solution A = new Solution();
        A.checkLinkedListPalindrome(llist.head);
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
    
}

class Solution
{
    static void checkLinkedListPalindrome(Node head)
    {
		// Find middle of LinkedList
		Node middle = middleOfLL(head);

		// Move middle to the right half
		middle = middle.next;

		// reverse the right half 

		middle = reverse(middle);

		// check if right half and left are equal

		boolean isPalindrome = isLeftEqualRight(head,middle);

		// print output
		
		if(isPalindrome){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
    }

	static boolean isLeftEqualRight(Node head , Node middle){

		while(middle!=null){

			if(middle.data != head.data){
				return false;
			}
			middle = middle.next;
			head = head.next;
		}
		return true;
	}

	static Node middleOfLL(Node head){
		Node slow = head , fast = head;

		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	

	static Node reverse(Node head){
		Node newHead = null;

		while(head!=null){
			Node temp = head.next;
			head.next= newHead;
			newHead = head;
			head = temp;
			
		}

		return newHead;
	}
}
