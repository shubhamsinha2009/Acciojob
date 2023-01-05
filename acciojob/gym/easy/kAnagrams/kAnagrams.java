package kAnagrams;

// Question Link -- https://course.acciojob.com/idle?question=05c4e411-0657-447f-8f0b-2ba24f62969f

import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
	  int k=sc.nextInt();
        String str1=sc.next();
        String str2=sc.next();
       
        Solution ob = new Solution();
        if (ob.areKAnagrams(str1, str2, k) == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {

		// Time Complexity - O(n)
		// Space Complexity - O(1) 

		if(s1.length() != s2.length()) return false;
		int freq[] = new int[26];

		for(int i =0 ; i<s1.length();i++)
			freq[s1.charAt(i) - 'a']++ ;
			
		for(int i =0 ; i<s2.length();i++){

			if(freq[s2.charAt(i)- 'a'] >0 ){
				freq[s2.charAt(i) -'a'] -- ;
			}else{
				k-- ; 
				
			}

			if(k<0) return false;

			
		}

	
			return true;
		
		
    }
}
