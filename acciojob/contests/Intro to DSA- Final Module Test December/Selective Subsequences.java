
// Question Link - https://course.acciojob.com/idle?question=df173da1-658a-4b78-8e59-44fca6d8351c

import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<String> generateSubsequences(String str)
    {  
		ArrayList<String> subSequences = getSequence(str);

		
        for(int i =1 ; i<subSequences.size();i++){
            String sub = subSequences.get(i);
            if(sub.length()%2!=0 && sub.length()%7!=0){
                subSequences.remove(i--);
            }
		
        }
		subSequences.remove(0);
        
        
        return subSequences;
    }


	public static ArrayList<String> getSequence(String str)
{

	// If string is empty
	if (str.length() == 0) {

		// Return an empty arraylist
		ArrayList<String> empty = new ArrayList<>();
		empty.add("");
		return empty;
	}

	// Take first character of str
	char ch = str.charAt(0);

	// Take sub-string starting from the
	// second character
	String subStr = str.substring(1);

	// Recurvise call for all the sub-sequences
	// starting from the second character
	ArrayList<String> subSequences =
						getSequence(subStr);

	// Add first character from str in the beginning
	// of every character from the sub-sequences
	// and then store it into the resultant arraylist
	ArrayList<String> res = new ArrayList<>();
	for (String val : subSequences) {
      // System.out.println(val);
	        res.add(val);
        
		 String g = ch+val;
		//  System.out.println(g);
			 res.add(g);
			
	
        
	}

	// Return the resultant arraylist
	return res;
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
