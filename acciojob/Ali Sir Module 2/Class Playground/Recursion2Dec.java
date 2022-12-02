
// Playground Link -- https://leetcode.com/playground/MQZnVqW9

// "static void main" must be defined in a public class.
public class Main {
    public static int sumOfNumbers(int n){
        if(n == 1) return 1;
        int sum = n + sumOfNumbers(n - 1);
        return sum;
    }
    public static void printNTimes(int n){
        if(n == 0) return;
        printNTimes(n - 1);
        System.out.println("ACCIOJOB");   
    }
    static void printFirstNNumbers(int n, int cur){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFirstNNumbers(n, 1);
    }
}
/*
We have to get a number from user and return the sum from 1 - n
ex :- 10
o/p = 55

*/
