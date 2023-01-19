
// Question Link -- https://course.acciojob.com/idle?question=43a06a39-622a-4331-9a4c-62ebfe7bc7ae


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        arr[i]=sc.nextInt();
        
        int target=sc.nextInt();

        Accio ob = new Accio();
        int ans= ob.findElement(arr, N,target);

        System.out.println(ans);
    
    }
}


class Accio {
    
    static  int findElement(int arr[], int n,int target)
    {

		

		if(n<=2){
			if(n==1 && arr[0] == target) return 0;
			else if (n==2 && arr[1] == target) return 1;
			else return -1;
		}
		int peakIndex = peakIndexInMountainArray(arr);
		
		if(peakIndex == -1) return -1;
		int index= binarySearch(arr,0,peakIndex,target,true);
	
		if(index ==-1){
			
			index = binarySearch(arr,peakIndex+1,n-1,target,false);
		
		}
		

		return index;
		
       
	}	

	public static int binarySearch(int[] arr ,int low ,int high,int target,boolean isAsc){

		while(low<=high){
				int mid = (low+high)/2;
		
			if(arr[mid] == target)return mid;

			else if((isAsc && arr[mid] < target) || (!isAsc && arr[mid] > target)){
					low = mid +1;
			}else{
				high = mid-1;
			}
		}
		return -1;
	}

	
	  public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low =0;
        int high = n-1;

        while(low<=high){
             int mid = (low+high)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            else if(arr[mid] < arr[mid+1]){
                 low=mid+1;
            }else{
               
                high=mid-1;
            }


        }

        return -1;
    }
}
