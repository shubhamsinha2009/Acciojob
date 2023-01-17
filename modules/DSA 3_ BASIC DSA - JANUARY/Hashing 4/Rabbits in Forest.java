
// Question Link - https://course.acciojob.com/idle?question=88702d43-c618-4743-b087-68a584856481

import java.util.*;

class Solution{
    public int numRabbits(int[] answers) {
         HashMap<Integer,Integer> map= new HashMap<>();
        int ans =0;
        for(int i :answers){
            
            int count = map.getOrDefault(i,0);
                int num = i+1;
                if(count%num==0) ans+=num;

            map.put(i,count+1);

        } 
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj =  new Solution();
        System.out.println(Obj.numRabbits(arr));
    }
}
