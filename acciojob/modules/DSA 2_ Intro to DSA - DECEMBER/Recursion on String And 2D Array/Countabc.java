
// Question Link --  https://course.acciojob.com/idle?question=8dff7ba2-333c-4674-90b7-d39b0bc7a070

import java.util.*;

public class Main {
    static int CountABC(String str) {

		if(str.length()<3) return 0;
		
		if(str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")){

			return 1 + CountABC(str.substring(1));
			
		}

		return CountABC(str.substring(1));
        
    }        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s));

    }
}
