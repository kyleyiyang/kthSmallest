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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> lst = new ArrayList<>();
        traversal(root.left,lst);
        int n=lst.size();
        if (n>=k) return lst.get(k-1);
        else {
            lst = new ArrayList<>();
            lst.add(root.val);
            traversal(root.right,lst);
            return lst.get(k-n-1);
        }
    }
    public void traversal(TreeNode root,List<Integer> lst) {
        if (root!=null) {
            traversal(root.left,lst);
            lst.add(root.val);
            traversal(root.right,lst);
        }
    }
}
