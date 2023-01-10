
// Question Link -- https://course.acciojob.com/idle?question=03e970b5-d00e-4fa6-b747-8ee732707e78

import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        
        Solution ob = new Solution();
        
        System.out.println(ob.countandsay(n));
    } 
} 
class Solution
{
    public String countandsay(int n) {
		

		String s = "1";
			
		for(int i = 1;i<n;i++){

			 s = count(s); 			

			
		}
		return s;


		
    }   

	public String count(String s){

		StringBuilder ans = new StringBuilder();
		char c = s.charAt(0);
		int count = 1;
		for(int i =1 ; i<s.length();i++){

			if(c==s.charAt(i)){

				count++;
			}else{
				ans.append(count).append(c);
				c=s.charAt(i);
				count =1;
			}
			
		}
		ans.append(count).append(c);
		return ans.toString();

	}
}
