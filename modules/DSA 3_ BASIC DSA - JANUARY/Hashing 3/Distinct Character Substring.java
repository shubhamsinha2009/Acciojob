
// Question Link -- https://course.acciojob.com/idle?question=a1fc462b-409b-4a19-aa5f-1f96ae32b972

import java.util.*;

public class Main {

    public static long DistinctCharacterSubstring(String s){
        int n = s.length();
		HashSet<Character> set = new HashSet<>();
		long sum =0;

		for(int i=0,j=0;i<n;i++){
				char ch = s.charAt(i);
					while(set.contains(ch)){
						char chh = s.charAt(j);
						set.remove(chh);
						j++;
					}
					
			sum+= i-j+1;
			set.add(ch);
		}
		return sum;
    }


    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long ans = DistinctCharacterSubstring(s);
        System.out.println(ans);
    }
}
