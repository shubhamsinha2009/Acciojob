
// Question Link -- https://course.acciojob.com/idle?question=38c7e0ba-2e2e-40a2-b207-e6f6171a5fbd

import java.util.*;
class Accio{
	public void printEncodingsHelper(String str , String ans){

		if(str.length()==0){
			System.out.println(ans);
			return;
		}
		 if(str.charAt(0) == '0') return;

		char s = (char) (str.charAt(0) -'0' - 1 + 'a');
		printEncodingsHelper(str.substring(1),ans+s);

		if(str.length()==1) return ;
		
		int n = Integer.parseInt(str.substring(0,2));
		if(n<=26){
			char c = (char) (n - 1 + 'a');
			printEncodingsHelper(str.substring(2),ans+c);
		}

		
		
		
	}
    public void printEncodings(String str) {

		printEncodingsHelper(str,"");
    }
}
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Accio Obj = new Accio();
        Obj.printEncodings(str);
    }
}
