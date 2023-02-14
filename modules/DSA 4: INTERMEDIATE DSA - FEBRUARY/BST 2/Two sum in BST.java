
// Question Link -- https://course.acciojob.com/idle?question=8b9059a2-281c-4f68-b038-6e7cd889f558

import java.util.*;

class Node {
    int val;
    Node left, right;
    public Node(int item){
        val = item;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node constructBST(int[]arr,int start,int end,Node root)
    {
        if(start>end)return null;
        int mid=(start+end)/2;
        if(root==null)root=new Node(arr[mid]);
        root.left=constructBST(arr,start,mid-1, root.left);
        root.right=constructBST(arr,mid+1,end, root.right);
        return root;
    }
}

class Solution{
		
	static Node curInorder ;
	static  Node curReverseInorder ;
	 static Stack<Node> inorderStack = new Stack<>();
	 static Stack<Node> reverseInorderStack = new Stack<>();
	
    public static boolean checkTarget(Node root, int tar){
        curInorder = root;
		curReverseInorder = root;
		
		
			int low = nextInorder();
			int high = nextReverseInorder();
		
			while(low<high){

					if(low+high < tar){
						low = nextInorder();
					}else if(low+high>tar){
						high = nextReverseInorder();
					}else{
							return true;
			
					}
			}
		return false;
    }

	public static int nextInorder(){

			while(curInorder!=null){

				inorderStack.push(curInorder);
				curInorder = curInorder.left;
			}

			Node pop = inorderStack.pop();
			curInorder = pop.right;
			return pop.val;
	} 

	public static int nextReverseInorder(){

			while(curReverseInorder!=null){
				reverseInorderStack.push(curReverseInorder);
				curReverseInorder = curReverseInorder.right;
			}

			Node pop = reverseInorderStack.pop();
			curReverseInorder = pop.left;
			return pop.val;
	} 

}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); 
        }
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);
        Solution A = new Solution();
        boolean ans = A.checkTarget(root,k);
        if(ans==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
