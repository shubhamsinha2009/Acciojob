
// Question Link -- https://course.acciojob.com/idle?question=190b12c6-5a31-436d-8821-bd29626d80ad

import java.util.*;

// Java program for flattening a Linked List
public class Main {

  /* Linked list Node*/
  static class Node {

    int data;
    Node right, down;

    Node(int data) {
      this.data = data;
      right = null;
      down = null;
    }
  }

  static Node flatten(Node root) {
    if(root == null || root.right == null) return root;
	  root.right = flatten(root.right);
	  root= merge(root,root.right);
	  root.right = null;
	  return root;
  }

	static Node merge(Node root1,Node root2){

		Node dummy = new Node(0),temp = dummy;

		while(root1!=null && root2!=null){

			if(root1.data < root2.data){
				temp.down = root1;
				root1=root1.down;
			}else{
				temp.down = root2;
				root2=root2.down;
			}

			temp=temp.down;
		}

		if(root1!=null){
			temp.down = root1;
		}else{
			temp.down = root2;
		}
		return dummy.down;
		
	}
	
	static void printList(Node head) {
			while(head!=null){
				System.out.print(head.data+" ");
				head=head.down;
			}
		System.out.println();
	  }

  public static boolean isCorrect(Node claim) {
    if (claim.right != null) return false;
    Node copy = claim;
    while (copy.down != null) {
      if (copy.down.data < copy.data) return false;
      copy = copy.down;
    }
    return true;
  }

  // Driver's code
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node ll = new Node(-1), prev1 = null, head = ll;
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      Node prev2 = null, copy = ll;
      while (k-- != 0) {
        int val = sc.nextInt();
        copy.data = val;
        copy.down = new Node(-1);
        prev2 = copy;
        copy = copy.down;
      }
      prev2.down = null;
      ll.right = new Node(-1);
      prev1 = ll;
      ll = ll.right;
    }
    sc.close();
    prev1.right = null;
    Node flattenedNode = flatten(head);
    printList(flattenedNode);
    if (isCorrect(flattenedNode)) System.out.println(
      "yes"
    ); else System.out.println("no");
  }
}
