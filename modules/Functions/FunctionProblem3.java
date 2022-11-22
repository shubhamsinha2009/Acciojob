
// Questions Link --- https://course.acciojob.com/idle?question=35d23453-a43b-4e9c-b87d-099e6a81260b

import java.io.*;

import java.util.*;

class Accio {
    
    static int fun(int n){
       for(int i =0 ; i<5 ; i++){
           n++;
           
       }  

        return n;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Accio Obj = new Accio();
        n = Obj.fun(n);
        System.out.println(n);
    }
}
