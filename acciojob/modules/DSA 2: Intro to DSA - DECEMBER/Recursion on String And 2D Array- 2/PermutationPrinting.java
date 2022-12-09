
// Question Link -- https://course.acciojob.com/idle?question=6a9ab058-5cca-42d5-aeea-3f4003dcd428 

import java.util.*;
  
public class Main{
  
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String s=scn.nextLine();
      String asf="";
      permutationPrint(s,asf);
   }
   public static void permutationPrint(String ques, String asf)
    {
		if(ques.length()==0){
			System.out.println(asf);
			return;
		}
		for(int i =0 ; i<ques.length();i++){
			permutationPrint(ques.substring(0,i)+ques.substring(i+1) , asf+ques.charAt(i));
		}

		
    }
  }
