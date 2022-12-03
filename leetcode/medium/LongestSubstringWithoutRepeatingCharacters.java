
// Question Link - https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character , Integer>  longestSubString = new HashMap<>();

        int maxLongestSubstring = 0;
        int currentLongestSubString = 0 ; 

    
    for(int i =0 ;  i<s.length();i++){

         if(longestSubString.containsKey(s.charAt(i))) {

        maxLongestSubstring = Math.max(currentLongestSubString,maxLongestSubstring);

        currentLongestSubString = Math.min(i - longestSubString.get(s.charAt(i)),               currentLongestSubString) ;

         }
              currentLongestSubString++ ;
           longestSubString.put(s.charAt(i),i+1);

    }
      
     return Math.max(currentLongestSubString,maxLongestSubstring) ;
        
    }
}
