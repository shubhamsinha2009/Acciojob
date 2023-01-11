
// Question Link - https://course.acciojob.com/idle?question=04fc9c68-b5bc-45fd-a894-2818207deae8

import java.io.*;
import java.util.*;


class Solution{
  public static void multiplyRecursively(int n, int m) {

	  if(n>m){
		   System.out.println(add(n,m));
	  }else{
		   System.out.println(add(m,n));
	  }
	 

  }

	public static int add(int n, int m){

		if(m==0) return 0;
		
		return n + add(n,m-1);
	}
	



	
}

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    Solution ob = new Solution();
    ob.multiplyRecursively(n, m);
  }
}
