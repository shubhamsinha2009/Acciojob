

// Question Link- https://course.acciojob.com/idle?question=db876dde-9729-4b24-8e42-df764cec3c5a

import java.util.*;

class Solution{
    static String repeatEnd(String str, int n) {

            String s = str.substring(str.length()-n);
                String sum = "";
            for(int i =0 ; i<n ;i++){
                    sum+=s;
            }
                return sum;
            
    }  
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(Solution.repeatEnd(s, k));
        sc.close();
    }
}
