
// Question Link - https://course.acciojob.com/idle?question=8f977c12-60c6-4201-8d21-c554284f9f81

import java.util.*;

class Accio{
    static String DoubleEachCharacter(String s){

		StringBuilder sb = new StringBuilder();

		for(int i =0 ; i<s.length();i++){
			sb.append(s.charAt(i));
			sb.append(s.charAt(i));
		}
		return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Accio obj = new Accio();
        String ans=obj.DoubleEachCharacter(s);
        System.out.println(ans);
    }
}
