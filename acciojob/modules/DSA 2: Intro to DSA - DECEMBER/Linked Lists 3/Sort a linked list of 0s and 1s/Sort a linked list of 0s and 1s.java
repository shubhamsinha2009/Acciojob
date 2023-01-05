
// Question Link - https://course.acciojob.com/idle?question=f656f647-2a8c-4cd4-87e3-fc99ef2cf99e

import java.util.*;

class Solution {
    static LinkedListNode<Integer> sort01(LinkedListNode<Integer> head){
        LinkedListNode<Integer> dummy0 = new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> dummy1 = new LinkedListNode<Integer>(1);

		LinkedListNode<Integer> temp0 = dummy0;
		LinkedListNode<Integer> temp1 = dummy1;

		LinkedListNode<Integer> temp = head ;

		while(temp!=null){

			if(temp.data == 0){
				temp0.next = temp;
				temp0 = temp0.next; 
			}else if(temp.data == 1){
				temp1.next = temp;
				temp1 = temp1.next; 
			}

			temp = temp.next;
		}

		temp0.next = dummy1.next;
		temp1.next = null;

		return dummy0.next;
		
    }
}

class LinkedListNode<T>  {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data)  {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(sc.nextInt());
        LinkedListNode<Integer> a = head;
        for(int i=1;i<n;i++) {
            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode<Integer> ans = Solution.sort01(head);
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.println(ans.data);
            }
            else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}

