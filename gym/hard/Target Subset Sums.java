
// Question Link -- https://course.acciojob.com/idle?question=ff9261bd-774f-4f0b-92bd-775d545c0019

import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> findSubsets(int[] arr, int tar) {
		int n = arr.length;
		ArrayList<ArrayList<Integer>> r = new ArrayList<>();
		ArrayList<Integer> l = new ArrayList<>();

		a(n-1,tar,arr,l,r);
		return r;
		
    }

	public static void a(int i,int k , int[] arr,
			ArrayList<Integer> l,ArrayList<ArrayList<Integer>> r ){
				if(k==0){
					r.add(new ArrayList<>(l));
					return;
				}
				if(i<0 || k < 0) return;

				a(i-1,k,arr,l,r);
				l.add(arr[i]);
				a(i-1,k-arr[i],arr,l,r);
				l.remove(l.size()-1);
		
			}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tar;
        n = sc.nextInt();
        tar = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<ArrayList<Integer>> subsets = findSubsets(arr, tar);
        Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        if (subsets.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < subsets.size(); i++) {
                for (int j = 0; j < subsets.get(i).size(); j++)
                    System.out.print(subsets.get(i).get(j) + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
