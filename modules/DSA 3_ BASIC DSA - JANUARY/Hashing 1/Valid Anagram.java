
// Question Link -- https://course.acciojob.com/idle?question=bedea261-bd68-4e76-aca3-3bab794e91e2

import java.util.*;

class Solution {
   static boolean areAnagram(String s, String t) {
if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int len = s.length();
        // Finding the count of each character in string S
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Subtracting the count for each character in string T.
        // If an extra char is found, we can return false.
        for (int i = 0; i < len; i++) {
            char c = t.charAt(i);
            Integer count = countMap.get(c);
            if (count == null) {
                return false;
            }
            if (count.equals(1)) {
                countMap.remove(c);
            } else {
                countMap.put(c, count - 1);
            }
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
