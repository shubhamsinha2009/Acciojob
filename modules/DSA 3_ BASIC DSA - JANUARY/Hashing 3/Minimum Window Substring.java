
// Question Link -- https://course.acciojob.com/idle?question=8c817174-62b5-46e8-8cf7-00cc0d0ffa47

import java.io.*;
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
		 
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);

    
        int minStart = 0;
        int minLength = Integer.MAX_VALUE;
        int charTLeft = t.length();

        int n = s.length();

        for(int i =0 ,j=0;i<n;i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                   int count =  map.get(ch);

                   if(count>0) charTLeft--;
                   map.put(ch,count-1);

            }
            while(charTLeft == 0){
                int curWindowLength = i-j+1;
                if(minLength> curWindowLength ){
                    minLength = curWindowLength;
                    minStart = j;
                }
                char chh = s.charAt(j);
                if(map.containsKey(chh)){
                    int count =  map.get(chh);
                   if(count==0) charTLeft++;
                   map.put(chh,count+1);
                }
                 j++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "": s.substring(minStart,minLength+minStart);
        
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s = sc.next();
		t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s,t));
    }
}
