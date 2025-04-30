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
    private ArrayList<Integer> vals = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        recurse(root, 0);
        return vals;
    }
    private void recurse(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (vals.size() <= level) {
            vals.add(root.val);
        } else {
            vals.set(level, Math.max(vals.get(level), root.val));
        }
        recurse(root.left, level + 1);
        recurse(root.right, level + 1);
    }
}