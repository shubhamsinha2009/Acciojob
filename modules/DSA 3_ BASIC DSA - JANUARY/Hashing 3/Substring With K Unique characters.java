
// Question Link -- https://course.acciojob.com/idle?question=10944e43-a4d3-4974-9ea9-02aa61d602ee

import java.util.*;

public class Main {

    public static int longestkSubstr(int n, int k,String s){

		HashMap<Character,Integer> map = new HashMap<>();

		int max =-1;
		for(int i =0,j=0 ; i<n;i++){
			char ch = s.charAt(i);

			map.put(ch,map.getOrDefault(ch,0)+1);
			// if or while both will work here amazingly 
				if(map.size()>k){
						char chh = s.charAt(j);
						int value = map.get(chh) - 1;
					if(value==0){
						map.remove(chh);
					}else{
						map.put(chh,value);
					}

					j++;
				}

				if(map.size() == k){
					max = Math.max(max,i-j+1);
				}

		}

		return max;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ans = longestkSubstr(n,k,s);
        System.out.println(ans);
    }
}
