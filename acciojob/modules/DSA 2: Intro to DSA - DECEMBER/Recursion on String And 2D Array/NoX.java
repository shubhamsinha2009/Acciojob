

// Question Link -- https://course.acciojob.com/idle?question=2aff4e35-b341-4902-b262-4c095ed174f9

import java.util.*;

public class Main {
    static String noX(String s) {

		if(s.length() ==0 ) return "";

		if(s.charAt(0) == 'x') return noX(s.substring(1));

		return s.charAt(0) + noX(s.substring(1));

		
  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}
