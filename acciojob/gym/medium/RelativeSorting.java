
// Question Link-- https://course.acciojob.com/idle?question=1cd14fb1-00a9-4f26-a55b-4aba95c08f5a

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    static void relativeSorting(int arr1[], int n, int arr2[], int m)
	{
		
		List<Integer> a = new ArrayList<>();

		for(int v : arr1){
			a.add(v);
		}
		Collections.sort(a);
		int insertPos =0;
		for(int i =0 ; i<m;i++){

			for(int j=insertPos ; j<a.size();j++){

				if(arr2[i] == a.get(j)){
					a.remove(j);
					a.add(insertPos++ ,arr2[i]);
				}
				
				
			}
			
		}
		for(int i :a){
			System.out.print(i + " ");
		}
	}
}
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[]=new int[n] ;
        int arr2[]=new int[m] ;
        for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
           arr2[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.relativeSorting(arr1, n, arr2 , m);
}
}
