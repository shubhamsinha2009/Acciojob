
class Solution{

    int maximum_occurrence(int a[], int n) {

		// HashMap Solution
		// Time Complexity -- O(n)
		// Space Complexity -- O(n)

		
		int max = 0;
		int maxO = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0 ; i<n ; i++){
		
			if(!map.containsKey(a[i])){

				map.put(a[i],1);
				
			}else{
				int value = map.get(a[i]);
				map.put(a[i],++value);

				if(value > max ){
					max = value;
					maxO = a[i];
				}
				if(value == max && a[i] < maxO ){
					maxO = a[i];
				}
			}
			

		
		}

		return maxO;
		
    }
}
