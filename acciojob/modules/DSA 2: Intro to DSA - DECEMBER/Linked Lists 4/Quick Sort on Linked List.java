
// Question Link -- https://course.acciojob.com/idle?question=f3eddcea-b156-4ab3-b36d-1bcd58a28078


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Main {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }

        Solution abc=new Solution();
        Node node = abc.quickSort(head);

        printList(node);
        System.out.println();
    
        sc.close();
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class Solution {
    
    public static Node quickSort(Node node)
    {
        Node end = endofLL(node);

		 quick(node,end);

			return node;
        
    }

	public static Node endofLL(Node node){
		if(node == null || node.next==null) return null;
		Node dummy = node ;

		while(dummy.next!=null){
			dummy=dummy.next;
		}

		return dummy;
	}

	public static void quick(Node start , Node end){
		if(start==end || start==null||end ==null || start == end.next) return ;

		Node prePivot = findPrePivotNode(start,end);
			
			quick(start,prePivot);

		if(start == prePivot){
			quick(prePivot.next,end);
		} else if(prePivot.next!=null){
				quick(prePivot.next.next,end);
		}
			
		
	}

	public static Node findPrePivotNode(Node start,Node end){


		Node pivot = start,prePivot= start;
		
		while(start!=end){
			if(start.data < end.data){
				swapNodeData(start,pivot);
				prePivot = pivot;
				pivot = pivot.next;
			}
			start=start.next;			
		}
		swapNodeData(pivot,end);

		return prePivot;
		
	}

	public static void swapNodeData(Node x , Node y){
			if(x==y) return;

			int temp = x.data;
			x.data= y.data;
			y.data = temp;
		
	}
	

}
