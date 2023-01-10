
// Question Link - https://course.acciojob.com/idle?question=63357edf-db57-4f72-bf2f-9dfa416884d7

import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        Node head=null;
        Node phead=null;
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            if(head==null)
                head=new Node(n1);
            else
                addHead(head,n1);
        }
        int m=sc.nextInt();
        while(m-->0){
            int n1=sc.nextInt();
            if(phead==null)
                phead=new Node(n1);
            else{
                addHead(phead,n1);
            }
        }
		Solution g=new Solution();
        System.out.println(g.multiplyLists(head,phead));
	}
   
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
}

class Solution{
   public long multiplyLists(Node first,Node second){

	    long N = 1000000007;
        long num1 = 0, num2 = 0;
  
        while (first != null || second !=  null){
              
            if(first != null){
                num1 = ((num1)*10)%N + first.data;
                first = first.next;
            }
              
            if(second != null)
            {
                num2 = ((num2)*10)%N + second.data;
                second = second.next;
            }
              
        }
        return ((num1%N)*(num2%N))%N;
	   
   }
}
