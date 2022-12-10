
//  Question Link -- https://course.acciojob.com/idle?question=394e5cf7-8fef-4439-8d0d-3b2583176bf0

import java.util.*;

class Main {
    static ArrayList <String> OldPhone(int n, int[] keys){

		ArrayList<String> list = new ArrayList<>();
			oldPhone(n,keys,"",list);
		Collections.sort(list);
		return list;
    }

	static void oldPhone(int n , int[] keys , String ans , ArrayList<String> list){

		if(n<0) return;
		if(n==0){
			list.add(ans);
			return;
		}

		String[] str = new String[]{"","ABC","DEF","GHI","JKL","MNO","PQRS","TU","VWX","YZ"};

		for(int i=0;i<str[keys[n-1]].length();i++){
			oldPhone(n-1,keys,str[keys[n-1]].charAt(i)+ans,list);
		}


		
	}
	
	public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for(int i=0;i<n;++i){
            keys[i] = sc.nextInt();
        }
        ArrayList <String> ans=OldPhone(n,keys);
        for(String i:ans) System.out.print(i+" ");
    }
}
