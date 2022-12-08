
// Question Link -- https://course.acciojob.com/idle?question=9123c554-21a6-4a1a-a824-e7fd6e851d65

import java.util.Scanner;

public class Main {
    static int countX(String s) {

		if(s.length()==0) return 0;

		if(s.charAt(0)=='x') 
			return countX(s.substring(1)) + 1 ;

		return countX(s.substring(1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        System.out.println(countX(str));
    }
}
