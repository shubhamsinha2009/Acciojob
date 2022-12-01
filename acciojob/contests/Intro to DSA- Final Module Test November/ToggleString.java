
// Question Link -- 

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	static String Toggle(String str){

		// Time Complexity -- O(n)
		// Space COmplexity -- O(n)

		int n = str.length();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0 ; i<n;i++){

			char c = str.charAt(i);

			sb.append(Character.isLowerCase(c) ? Character.toUpperCase(c):Character.toLowerCase(c));
		}
		return sb.toString();
	}
}
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();

		Solution Obj = new Solution();
		System.out.print(Obj.Toggle(str));
	}
}
