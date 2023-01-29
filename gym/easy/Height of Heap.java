
// Question Link -- https://course.acciojob.com/idle?question=d7ba81e8-2c46-4f67-bc67-4da93b84741d

import java.util.*;

class Accio{
    static int HeightOfHeap(int n,int[] arr){
         return (int)(Math.log(n) / Math.log(2));    
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans=obj.HeightOfHeap(n,arr);
        System.out.println(ans);
    }
}
