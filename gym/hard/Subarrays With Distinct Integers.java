
// Question Link -- https://course.acciojob.com/idle?question=e4db4e3a-7e09-4168-8a84-df5187f34ca3

import java.util.*;

class Accio {
    public static int solve(int[] nums, int k) {
       
       return subArrayAtMost(nums,k) - subArrayAtMost(nums,k-1);

    }

    public static int subArrayAtMost(int[] nums, int k){
     int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        int count =0; 
        
        for(int i =0,j=0 ;i<n;i++){
            int element = nums[i];

            map.put(element,map.getOrDefault(element,0)+1);

                while(map.size() > k){
                 int value = map.get(nums[j]) - 1;
                if(value ==0 ){
                    map.remove(nums[j]);
                }else{
                    map.put(nums[j],value);
                }
                    j++;
                }
              

             if(map.size() <= k){
                count += i - j;
            }


        }
        return count;

    }
}

public class Main {  
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
		int[] a = new int[n];
    	for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		Accio Obj = new Accio();
        System.out.println(Obj.solve(a, b));
        sc.close();
	}
}
