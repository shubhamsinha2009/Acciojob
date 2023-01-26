
// Question Link -- https://course.acciojob.com/idle?question=09fc4541-95da-4be3-8c19-875d32fe59c1

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Solution{
        

    public static int maxPathSum(TreeNode root) {
        return maxPath(root).maxSum;

       }

    public static Pair maxPath(TreeNode root){
        
        if(root == null) return new Pair(0,Integer.MIN_VALUE);

        Pair ls =  maxPath(root.left); 
        Pair rs = maxPath(root.right);
        
        int sum = ls.sum + rs.sum + root.data ;

        int maxSum =   Math.max(sum,Math.max(ls.maxSum,rs.maxSum));

        int gainSum =   Math.max(0, root.data + Math.max(ls.sum,rs.sum));


        return new Pair(gainSum,maxSum);
    }
}

class Pair{
    int sum ;
    int maxSum;

    Pair(int sum , int maxSum){
        this.sum = sum;
        this.maxSum = maxSum ;
    }

}



class Main {
    public static TreeNode buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N')
            return null;

        String[] nodes = str.split(" ");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {

            TreeNode currNode = queue.poll();

            String currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= nodes.length)
                break;
            currVal = nodes[i];

            if (!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeNode root = buildTree(s);
        int maxPath = Solution.maxPathSum(root);
        System.out.println(maxPath);
    }
}
