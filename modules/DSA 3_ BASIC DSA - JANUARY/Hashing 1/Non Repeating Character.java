
// Question Link -- https://course.acciojob.com/idle?question=4bf92311-0388-4e38-b13f-1563b7469901

import java.io.*;
import java.util.*;

class Solution {
    public void nonRepeatingCharacter(String s) {
		int n = s.length();
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++){
				char ch = s.charAt(i);
			int count = map.getOrDefault(ch,0)+1 ;
				map.put(ch,count);
		}

		if(!map.containsValue(1)) System.out.println(-1);
		else{
				for(int i=0;i<n;i++){
				char ch = s.charAt(i);
					if(map.get(ch) == 1){
						System.out.println(ch);
						break;
					}
		}

		}
		
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        Solution Obj = new Solution();
        Obj.nonRepeatingCharacter(s);  
        System.out.println();
    }
}
