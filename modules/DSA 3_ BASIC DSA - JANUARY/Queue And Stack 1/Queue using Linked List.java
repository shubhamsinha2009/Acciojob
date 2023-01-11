
// Question Link -- https://course.acciojob.com/idle?question=b3346122-ef12-4cc2-b8aa-4b1d9fdda3ba

import java.util.*;

class Node{

	int data;
	Node next;
	
	Node(int data){
		this.data = data ;
		this.next =null;
	}
	
}
class Queue {

	Node front ,rear ;
	int size =0;

	public Queue(){
		this.front=null;
		this.rear = null;
	}


    public void push(int value) {
		size++;
        if(front == null){
			front = new Node(value);
			rear = front;
			return;
		}

		rear.next = new Node(value);
		rear = rear.next;
    }
    public int pop() {
			if(front == null) return -1;
			if(front.next == null){
				int temp = front.data;
					front = null;
					size =0;
					return temp;
			}
		size--;
			Node temp = front;
			front= front.next;
			temp.next = null;
			return temp.data;
    }
    public int front() {
        return front.data;
    }
    public int getSize() {

		return size;                       
		
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.getSize());
        }
    }
}
