class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the tree is empty, there is no root-to-leaf path
        if (root == null) {
            return false;
        }
        
        // If we are at a leaf node, check if its value equals the remaining targetSum
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        
        // Recursively check left and right subtrees with the reduced target sum
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}