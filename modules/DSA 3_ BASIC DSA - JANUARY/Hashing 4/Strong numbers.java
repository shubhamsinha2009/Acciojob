
// Question Link - https://course.acciojob.com/idle?question=fb2f1827-ee63-4774-95fd-b9aae8981101

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static boolean strongNumbers(long n) 
    { 
		if(n<=1) return false;
		long x=2;
		int count =0;

		while(n>1){

			if(n%x==0){
				n/=x;
				count++;	
			}else{		
				if(count==1) return false;
				x++;
				count=0;
				
			}

		}
		if(count==1) return false;
		return true;

		
    } 
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        if(strongNumbers(n))
        System.out.println(1);
        else
        System.out.println(0);
	}
}
