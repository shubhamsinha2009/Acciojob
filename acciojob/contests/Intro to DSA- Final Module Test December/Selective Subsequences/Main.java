
// Question Link - https://course.acciojob.com/idle?question=df173da1-658a-4b78-8e59-44fca6d8351c

import java.io.*;
import java.util.*;

public class Main {
  public static void solver(String str,int i,String sub,ArrayList<String> ans){
		if(i==-1){
			if((sub.length()%2==0||sub.length()%7==0)&&sub.length()!=0){
				ans.add(sub);
				return;
			}
		}
		if(i<=-1) return;

		solver(str,i-1,sub,ans);

		solver(str,i-1,str.charAt(i)+sub,ans);

		
	}
    public static ArrayList<String> generateSubsequences(String str)
    {
        // write your code here
		ArrayList<String> ans=new ArrayList<>();
		solver(str,str.length()-1,"",ans);
		return ans;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
