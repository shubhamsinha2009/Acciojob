
// Questions Link -- https://course.acciojob.com/idle?question=d87d1a01-6956-4b27-a521-0499605191b1

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(countEncodings(str));
  }

  public static int countEncodings(String str) {

	  
		if(str.length()==0) return 1;
		 if(str.charAt(0) == '0') return 0;

		int count = 0;
		count+= countEncodings(str.substring(1));

		if(str.length()==1) return count;
	  
		int n = Integer.parseInt(str.substring(0,2));
	  
		if(n<=26) 
			count+= countEncodings(str.substring(2));

		return count ;
	  
  }
}
