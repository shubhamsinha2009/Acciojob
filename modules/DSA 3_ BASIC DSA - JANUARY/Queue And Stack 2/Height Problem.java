
// Question Link -- https://course.acciojob.com/idle?question=d66b627a-f0fe-4c9a-aefb-3582a213de33

import java.util.*;

class Accio{
    static int[] HeightProblem(int n,int[] arr){

		Stack<Integer> stack = new Stack<>();

		int ans[] = new int[n];

		for(int i=0;i<n;i++){

			while(!stack.empty() && stack.peek() >= arr[i]){
					stack.pop();				
			}

			ans[i] = stack.empty() ? -1 :stack.peek();

			stack.push(arr[i]);
			
			
		}
		
		return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int[] ans=obj.HeightProblem(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
