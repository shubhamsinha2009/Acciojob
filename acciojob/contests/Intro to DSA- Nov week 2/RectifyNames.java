

// Question Link - https://course.acciojob.com/idle?question=3638756a-9936-4e23-8579-cfffd8d9e959

import java.io.*;
import java.util.*;

class Solution {
	public String rectifyName(String title) {
                boolean cap = true;
                String s = "";
                for(int i =0 ; i<title.length();i++){

                        if(title.charAt(i) == ' '){
                                s+= ' ';
                                cap = true;
                                continue;
                        }

                        if(cap){
                           s+=  Character.toUpperCase(title.charAt(i));
                               
                               cap = false;
                        }else{
                              s+=  Character.toLowerCase(title.charAt(i));
                        }

                }
                        
                        return s;
                }

                
		// Your code here
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        Solution Obj = new Solution();
        String result = Obj.rectifyName(str);
        System.out.print(result + " ");        
        System.out.println('\n');
    }
}
