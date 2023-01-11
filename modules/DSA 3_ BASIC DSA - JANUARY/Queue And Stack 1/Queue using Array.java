
// Question Link -- https://course.acciojob.com/idle?question=5e1ce738-3090-4c62-a704-6565f15593d6

import java.util.*;


class Queue {

	int[] a;
	int front =-1;
	int rear = -1;
	
    public Queue() {
       a = new int[1000];
    }

    public void push(int newElement) {
        if(front ==-1 && rear ==-1){
			front = rear =0;
			a[rear] = newElement;
			return;
		}

		if( (rear + 1)%1000 == front){
			// Array is full
			return;
		}

		rear++;
		rear%=1000;
		a[rear]= newElement;
    }
    public int pop() {

		if(rear == -1 && front ==-1) return 0;
		if(rear == front){
			int temp = a[front];
			front=rear=-1;
			return temp;
		}
		int temp = a[front];
			front++;
			front%=1000;
	
			return temp;
    }
    public int front() {
	        return a[front];
    }
    public int size() {
	      if(rear == -1 && front ==-1) return 0;

	
			if(rear>= front) return rear - front + 1;
			else return 1000 - front + rear;
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
                System.out.println(q.size());
        }
    }
}
