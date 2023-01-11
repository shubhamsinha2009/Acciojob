
// Question Link - https://course.acciojob.com/idle?question=a43a8fee-7bba-4cb7-9691-9172b3716b9b

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(input.nextInt());
        }

		Stack<Integer> stack = new Stack<>();

		for(int i =0;i<k;i++){
			stack.push(q.remove());
		}

		for(int i =0;i<k;i++){
			q.add(stack.pop());
		}

		for(int i =0;i<n-k;i++){
			q.add(q.remove());
		}
		
        while(q.size() > 0){
            System.out.print(q.poll() + " ");
        }
    }
}
