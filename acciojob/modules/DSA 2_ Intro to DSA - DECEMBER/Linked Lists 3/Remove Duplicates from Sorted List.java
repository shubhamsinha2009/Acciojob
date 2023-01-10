
// Question Link -- https://course.acciojob.com/idle?question=dbee5570-e9a9-4ebb-a0dc-1d104f838536

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
    static Node temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            head = null;
            temp = null;
            addToTheLast(a1);

            for (int i = 1; i < n; i++) {
                int data = sc.nextInt();
                addToTheLast(data);
            }
            Solution ans = new Solution();
            Node node = ans.solve(head);
            printList(node);
            System.out.println();
            sc.close();
    }

    public static void addToTheLast(int data) {
        if (head == null) {
            head = new Node(data);
            temp = head;
            return;
        } else {
            Node new_node = new Node(data);
            temp.next = new_node;
            temp = temp.next;
            return;
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

class Solution {
    public Node solve(Node head) {
          Node temp = head;

        while( temp!=null && temp.next!=null){

            if(temp.data == temp.next.data){
                
                temp.next = temp.next.next;
                
            }else{
                temp = temp.next;
            }

                
        }

        return head;
    }
}

