
// Question Link -- https://course.acciojob.com/idle?question=dae9f363-8990-4fae-95b6-acc980306a35

import java.util.*;

class Node{
  int data ;
  Node next;
  Node(int d)
  {
    data = d;
    next = null;
  }
}

class Main{
  Node head;
  Node tail;
  
  void printList(Node head){
    Node tnode = head;
    while(tnode != null)
    {
      System.out.print(tnode.data+ " ");
      tnode = tnode.next;
    }
    System.out.println();
  }
  
  void addToTheLast(Node node){
    if(head == null)
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
  
  Node searchContact(Node head, int k){
    Node current = head;
    while(current != null){
      if(current.data == k)
        break;
      current = current.next;
    }
  return current;
  }
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Main phoneBook = new Main();
      int a1=sc.nextInt();
      Node head= new Node(a1);
      phoneBook.addToTheLast(head);
      for (int i = 1; i < n; i++) {
      int a = sc.nextInt(); 
      phoneBook.addToTheLast(new Node(a));
    }
      int k = sc.nextInt();
      Node del = phoneBook.searchContact(phoneBook.head,k);
      Solution g = new Solution();
      if(del != null && del.next != null)
      {
        g.deleteContact(del);
      }
      phoneBook.printList(phoneBook.head);
  }
}

class Solution
{
  void deleteContact(Node contact){

	  contact.data = contact.next.data;
	  contact.next = contact.next.next;
  }
}

