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
    int tsum = 0;
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.tsum = targetSum;
        helper(root, 0);
        return ans;
    }

    public void helper(TreeNode root, int sum) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            if( (sum + root.val) == this.tsum) {
                this.ans = true;
                return;
            }
            return;
        }
        helper(root.left, sum + root.val);
        helper(root.right, sum + root.val);
    }
}