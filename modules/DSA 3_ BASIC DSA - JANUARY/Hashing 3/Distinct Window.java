
// Question Link - https://course.acciojob.com/idle?question=9cc8f33f-8879-4406-8eee-193ccc59fbac

import java.util.*;

public class Main {

    public static String DistinctWindow(String s){

		HashMap<Character,Integer> map = new HashMap<>();

		for(char ch : s.toCharArray()){
				map.putIfAbsent(ch,1);
		}

		int requiredSize = map.size();
		int n = s.length();
		
		int minLength = n+1;
		int minStart = 0;
		
		for(int i =0 ,j=0;i<n;i++){
				char ch = s.charAt(i);
				int count = map.get(ch);
				if(count >0) requiredSize--;
				map.put(ch,count-1);
		
			while(requiredSize==0){
					int length = i-j+1;
					if(minLength > length){
						minLength =length;
						minStart = j;
					}
					char chh = s.charAt(j);
					int count2 = map.get(chh);
					if(count2==0) requiredSize++;
					map.put(chh,count2+1);
		
					j++;
			  }
		}

		return minLength >= n ? s :s.substring(minStart,minStart+minLength);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = DistinctWindow(s);
        System.out.println(ans);
    }
}
