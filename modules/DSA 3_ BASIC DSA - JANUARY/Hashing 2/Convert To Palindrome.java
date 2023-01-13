
// Question Link -- https://course.acciojob.com/idle?question=1d8f5733-471c-4eca-916b-323678013a32

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static int solve(String A) {
      int start = 0;
		int end = A.length()-1;
		int count = 0;

		while(start<end){
			

			if(A.charAt(start) == A.charAt(end)){
				start++;
				end--;
				
			}else{
					
					if(A.charAt(start+1) == A.charAt(end)){
						start+=2;
						end--;
						count++;
					}else if(A.charAt(start) == A.charAt(end-1)){
						start++;
						end-=2;
						count++;
					}else{
						return 0;
					}
			}
			if(count>1) return 0;
		}
		
		return 1;

		// if(count == 1 ){
		// 	return 1;
		// }else if(count >1){
		// 	return 0;
		// }else{
		// 	if(A.length()%2==0) return 0;
		// 	else return 1;
		// }
			
		
		
		
    }
}

public class Main{
          public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
	    String A = sc.nextLine();
            Solution Obj = new Solution();
            int ans=Obj.solve(A);
            System.out.println(ans);
	}
}
