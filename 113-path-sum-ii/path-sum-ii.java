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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return ans;
        }
        helper(root, targetSum);
        return ans;
    }

    public void helper(TreeNode root, int target) {
        if(root == null) {
            return;
        }
        list.add(root.val);

        if(root.left == null && root.right == null && target == root.val) {
            ans.add(new ArrayList<>(list));
            list.removeLast();
            return;
        }

        helper(root.left, target - root.val);
        helper(root.right, target - root.val);
        list.removeLast();
    }
}