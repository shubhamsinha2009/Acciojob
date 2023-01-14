
// Question link - https://course.acciojob.com/idle?question=78adbda5-bbd0-4246-b173-5301ca6a0ac0

import java.util.*;

class Solution {
    public int longestSubstring(String s) {
         HashMap<Character , Integer>  longestSubString = new HashMap<>();

        int maxLongestSubstring = 0;
        int currentLongestSubString = 0 ; 

    
    for(int i =0 ;  i<s.length();i++){

         if(longestSubString.containsKey(s.charAt(i))) {

        maxLongestSubstring = Math.max(currentLongestSubString,maxLongestSubstring);

        currentLongestSubString = Math.min(i - longestSubString.get(s.charAt(i)),currentLongestSubString) ;

         }
              currentLongestSubString++ ;
           longestSubString.put(s.charAt(i),i+1);

    }
      
     return Math.max(currentLongestSubString,maxLongestSubstring) ;
    }
}

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans=ob.longestSubstring(s);
        System.out.println(ans);
    }
}
