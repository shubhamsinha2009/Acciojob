
// Question Link -- https://course.acciojob.com/idle?question=308cc4cd-d7e7-4df0-a378-6fcbf1cbca5f

import java.util.*;

public class Main {
    static String PairStar(String str) {

		if(str.length()==1) return str;

		if(str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + PairStar(str.substring(1));

		return str.charAt(0) + PairStar(str.substring(1));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(PairStar(s));
    }
}
