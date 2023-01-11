
// Question Link -- https://course.acciojob.com/idle?question=92c45e7a-8b9b-4bd3-91de-34561c0b4eba

import java.util.*;
import java.io.*;
 
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution obj=new Solution();
        obj.solve(a, n);
    }
}
class Solution{ 
	public void solve(int arr[],int n) 
	{ 
		ArrayList<Integer> left = new ArrayList<Integer>();
		for (Integer i : arr)
		        left.add(i);
		
				quickSort(left);
	} 
	public static ArrayList<Integer> quickSort(ArrayList<Integer> left)
	{ 

		ArrayList<Integer> right = new ArrayList<>(); 

		int pivot = left.remove(0); 

		int end = left.size();
		for(int i = 0;i<end;i++)
			if(left.get(i)>pivot){ 
				right.add(left.remove(i--));
				end--;
			}
	
		
		if(left.size() > 1) left = quickSort(left); 
		if(right.size() > 1) right = quickSort(right);
		
		left.add(pivot);
		left.addAll(right);

		for(Integer i : left)
			System.out.print(i + " ");

		System.out.println(""); 
		return left; 
	} 
}

 

 
 
