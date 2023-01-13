
// Question Link -- https://course.acciojob.com/idle?question=bef05518-ca74-4dc9-b0c7-b3a3a0c4475d

import java.util.*;

class Solution 
{
    static int[] findRepeatingAndMissingNumbers(int[] nums) 
    {
			  
        HashSet<Integer> set = new HashSet<>();
		int[] ans = new int[2];
		
		for(int num: nums) {
			if(!set.add(num)){
				ans[0] =num;
			};
		}

		for(int i=1;i<=nums.length;i++){
			if(!set.contains(i)){
				ans[1] = i;
				return ans;
			}
		}
		return ans ;
		

		
    }

	public static vois swap(int[] a , int i , int j){
		int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
	}
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0;i<N;i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = Solution.findRepeatingAndMissingNumbers(nums);
        System.out.print(ans[0] + " " + ans[1] + "\n");
    }
}
