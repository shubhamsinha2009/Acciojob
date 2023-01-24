
// Question Link -- https://course.acciojob.com/idle?question=5df12dec-c6d0-48c3-ab81-0fe4d08c390e


import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        int n,k;
        Scanner in = new Scanner(System.in);
	    n = in.nextInt();
	    k=in.nextInt();
	   in.nextLine();
        MyCircularDeque obj=new MyCircularDeque(k);
        for(int i=0;i<n-1;i++)
        {
            String[] s = in.nextLine().split(" "); 
            
            if(s[0].equals("insertFront"))
            {
                int value=Integer.parseInt(s[1]);
                boolean ans=obj.insertFront(value);
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("insertLast"))
            {
                int value=Integer.parseInt(s[1]);
                boolean ans=obj.insertLast(value);
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("deleteFront"))
            {
                boolean ans=obj.deleteFront();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("deleteLast"))
            {
                boolean ans=obj.deleteLast();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("isFull"))
            {
                boolean ans=obj.isFull();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("isEmpty"))
            {
                boolean ans=obj.isEmpty();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }

            else if(s[0].equals("getFront"))
            {
                int ans=obj.getFront();
                System.out.print(ans+" ");
            }

            else if(s[0].equals("getLast"))
            {
                int ans=obj.getRear();
                System.out.print(ans+" ");
            }
        }

    System.out.println();
    }
    
}

class MyCircularDeque {

	int head , tail , size ,n;
	int[] a;
    public MyCircularDeque(int k) {
        a=new int[k];
		n = a.length;
		tail =1;
    }
    
    public boolean insertFront(int x) {
        if(size==n) return false;
		a[head=++head%n] = x;
		size++;
		return true;
    }
    
    public boolean insertLast(int x) {
        if(size == n ) return false ;
		a[tail = (--tail+n) %n]=x;
		size++;
		return true;
    }
    
    public boolean deleteFront() {
        if(size==0) return false;
		head=(--head +n)%n;
		size--;
		return true;
    }
    
    public boolean deleteLast() {
        if(size==0) return false;
		tail= ++tail%n;
		size--;
		return true;
    }
    
    public int getFront() {
        return size==0?-1:a[head];
    }
    
    public int getRear() {
        return size==0?-1:a[tail];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size ==a.length;
    }
}
