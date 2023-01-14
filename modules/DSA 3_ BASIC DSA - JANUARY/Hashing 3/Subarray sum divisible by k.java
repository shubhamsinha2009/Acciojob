
// Question link -- https://course.acciojob.com/idle?question=6b0355db-2e09-4afa-8be4-045d710113fb

import java.io.*;
import java.util.*;

public class Main {

    public static int subarrayDivisbleByK(int nums[], int n, int k){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans =0;
        int sum =0;
        map.put(0,1);
        for(int element : nums){
            sum += element;
            int rem = sum%k;

            if(rem<0) rem+=k;

            int count = map.getOrDefault(rem,0);

            ans+=count;

            map.put(rem,count+1);
        }
        return ans; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}
