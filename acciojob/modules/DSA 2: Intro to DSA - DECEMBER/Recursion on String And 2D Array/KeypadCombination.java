
// Question Link -- https://course.acciojob.com/idle?question=6322632b-8190-4c42-b099-016314217d72

import java.io.*;
import java.util.*;

public class Main {
    static void printKPC(String ques,String ans ) {
			if(ques.length()==0){
				System.out.println(ans);
				return;
			} 

			String[] ch = new String[]{".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

				int n=ques.charAt(0) -'0'; 
				
				
				for(int i =0 ; i<ch[n].length();i++){

					printKPC(ques.substring(1),ans+ch[n].charAt(i));
				}
	
	}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str,"");
    }
}
