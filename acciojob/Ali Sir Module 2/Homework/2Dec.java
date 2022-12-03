
// https://leetcode.com/playground/RUTsAqiS


public class Main {
    
 static void printFirstNNumbersThenReverse(int n){
      System.out.print(n+" ");
        if(n > 1){
            printFirstNNumbersThenReverse(n - 1);    
        }   
         System.out.print(n+" ");
        return;
    }
    
 static void printNumberBetweenXandY(int x,int y){

     if(x>y){
         printBetween(y,x);
     }else if(y>x){
         printBetween(x,y);
     }else{
          System.out.print(y+" ");
         return;
     }
     
 } 
    
 static void printBetween(int x,int y){
        if(x==y){
            System.out.print(x+" ");
         return;
        }
        System.out.print(x+" ");
        printNumberBetweenXandY(x+1,y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        // Q1. Print 5 4 3 2 1 1 2 3 4 5
         printFirstNNumbersThenReverse(n);
        
        // Q2. Number Between x and y
        // int m = sc.nextInt();
        // printNumberBetweenXandY(n,m);
        
    }
}




