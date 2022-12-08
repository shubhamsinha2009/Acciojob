

// Question Link -- https://course.acciojob.com/idle?question=b63a6d2a-0420-4244-a101-07df0a98872f

import java.io.*;
import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str){
		int n = str.length()-1;
		if(n<=2) return true ;
		if(str.charAt(0) != str.charAt(n))
			return false;

		return isPalindrome(str.substring(1,n));
        
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        boolean result=isPalindrome(str);
        if(result)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
