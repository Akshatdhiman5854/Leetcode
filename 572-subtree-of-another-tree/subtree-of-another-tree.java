/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //call pre order for both root and subroot
        //After we got preorder for both, check whether root's preorder contains subroot's preorder or not
        //if it contains return true else false
        String rootOrder = preOrderTraversal(root);
        String subRootOrder = preOrderTraversal(subRoot);

        return rootOrder.contains(subRootOrder);
    }
    //for preorder we will follow root -> left -> right
    public String preOrderTraversal(TreeNode node){
        //if node is null return null
        //Here if node is null, we will add that node also in our string, to manage the edge cases
        if(node==null) return "null";
        //Here in String Builder we are using ^ as a separator, for a special test case, which is given below, to handle this test case we use ^ 
        /* root = 12, subtree = 2
        root = 12nullnull
        subtree = 2nullnull
         */
        StringBuilder sb = new StringBuilder("^");
        //i.e., add node value in sb
        sb.append(node.val);
        //call preorder for left node, and add it's return value in sb
        sb.append(preOrderTraversal(node.left));
        //call preorder for right node, and add it's return value in sb
        sb.append(preOrderTraversal(node.right));
        //return the string format of sb
        return sb.toString();
    }
}