
// Question Link -- https://course.acciojob.com/idle?question=0dd4bc90-7cd3-45f8-bd73-81ada8c52c67

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node constructBST(int[] arr, int start, int end, Node root) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;

        if (root == null)
            root = new Node(arr[mid]);

        root.left = constructBST(arr, start, mid - 1, root.left);
        root.right = constructBST(arr, mid + 1, end, root.right);

        return root;

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(arr);
        Node root = null;
        BinarySearchTree bst = new BinarySearchTree();
        root = bst.constructBST(arr, 0, n - 1, root);

        Accio A = new Accio();
        A.targetSum(root, target);

        sc.close();
    }
}

class Accio {
    
	 Node curInorder ;
	 Node curReverseInorder ;
	 Stack<Node> inorderStack = new Stack<>();
	 Stack<Node> reverseInorderStack = new Stack<>();
	
    public void targetSum(Node root, int tar)
    {
        curInorder = root;
		curReverseInorder = root;
		
		
			int low = nextInorder();
			int high = nextReverseInorder();
			boolean isEmpty = false;
			while(low<high){

					if(low+high < tar){
						low = nextInorder();
					}else if(low+high>tar){
						high = nextReverseInorder();
					}else{
						isEmpty = true;
						System.out.println(low + " " + high);
						low = nextInorder();
						high = nextReverseInorder();
					}
			}
		if(!isEmpty) System.out.println(-1);
    }

	public int nextInorder(){

			while(curInorder!=null){

				inorderStack.push(curInorder);
				curInorder = curInorder.left;
			}

			Node pop = inorderStack.pop();
			curInorder = pop.right;
			return pop.data;
	} 

	public int nextReverseInorder(){

			while(curReverseInorder!=null){
				reverseInorderStack.push(curReverseInorder);
				curReverseInorder = curReverseInorder.right;
			}

			Node pop = reverseInorderStack.pop();
			curReverseInorder = pop.left;
			return pop.data;
	} 

}
