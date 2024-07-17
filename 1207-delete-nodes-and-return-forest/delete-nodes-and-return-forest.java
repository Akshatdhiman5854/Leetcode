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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if(root == null) {
            return new ArrayList<TreeNode>();
        }

        List<TreeNode> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int x : to_delete) {
            set.add(x);
        }

        traverse(root, ans, set);

        if(!set.contains(root.val)) {
            ans.add(root);
        }

        return ans;
    }

    
    public TreeNode traverse(TreeNode root, List<TreeNode> ans, Set<Integer> set) {
        if(root == null) {
            return null;
        }

        root.left = traverse(root.left, ans, set);
        root.right = traverse(root.right, ans, set);

        if(set.contains(root.val)) {
            if(root.left != null) {
                ans.add(root.left);
            }

            if(root.right != null) {
                ans.add(root.right);
            }

            return null;
        }

        return root;
    }


}