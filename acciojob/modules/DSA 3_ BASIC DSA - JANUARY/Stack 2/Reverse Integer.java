
//Question Link - https://course.acciojob.com/idle?question=b72cbf47-64e8-41e6-b6c7-285988367003

import java.util.*;
import java.lang.*;
import java.io.*;
class Solution{
    public int reverseInteger(int x) {
        int prevRev = 0;
        int res=0;
        while( x != 0){
            res= res*10 + x % 10;
            if((res - x % 10) / 10 != prevRev){
                return 0;
            }
            prevRev = res;
            x= x/10;
        }
        return res; 
    }
}

public class Main {
	
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    	int x = sc.nextInt();
            Solution obj = new Solution();
			System.out.println(obj.reverseInteger(x));
	    	
		
	}
}
