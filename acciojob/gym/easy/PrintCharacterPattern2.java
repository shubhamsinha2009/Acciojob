
// Question Link -- https://course.acciojob.com/idle?question=0af6f7a5-b611-4d69-978b-c5028d25878a

import java.util.*;

class Solution {
    public void printPattern2(int n) {
		
       for(int i =0 ;i<n;i++){
		   char a = (char)('A' + (char)i);
		   
		   for(int j =0;j<=i;j++){
			  char p = (char)(a+j);

			   if(p > 'Z'){
				   p =(char) (p - 1 -'Z' + 'A');
			   }
			   System.out.print((char)p);
		   }
		   System.out.println();
	   }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printPattern2(n);
        sc.close();
    }
}
