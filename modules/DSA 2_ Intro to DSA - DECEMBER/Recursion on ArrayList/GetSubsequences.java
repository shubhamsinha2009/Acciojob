

// Question Link -- https://course.acciojob.com/idle?question=9ecd1991-1197-4872-a44d-aff68aa6f20b

import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<String> generateSubsequences(String str)
    {

		ArrayList<String> list = new ArrayList<String>();
			generate(str,"",list);
		Collections.sort(list);
		return list;
    }

	public static void generate(String str, String ans, ArrayList<String> list){

		if(str.length()<0)return;
		if(ans.length()>=1) list.add(ans);
		for(int i =0; i<str.length();i++){
			generate(str.substring(i+1),ans+str.charAt(i),list);
		}
		
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
