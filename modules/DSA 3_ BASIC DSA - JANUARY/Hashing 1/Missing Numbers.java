
// Question Link -- https://course.acciojob.com/idle?question=560ab8d1-ed6f-45e0-b3be-a0d1c1d56499

import java.util.*;

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {

		HashMap<Integer,Integer> map = new HashMap<>();

		ArrayList<Integer> list = new ArrayList<>();

		for(Integer i : brr) map.put(i,map.getOrDefault(i,0)+1);
		for(Integer i : arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i)-1);
			}
		} 
	
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(entry.getValue() != 0){
				list.add(entry.getKey());
			}		
		}

		if(list.size()==0){
			System.out.print(-1);
		}else{
		Collections.sort(list);
		for(Integer i : list) System.out.print(i+" ");
		}
		
			
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
    }
}
