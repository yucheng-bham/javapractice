
// * Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int maxindex = 0;
        // int[] left = new int[nums.length - 1];
        // int[] right = new int[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxindex = i;
            }
        }
        TreeNode node = new TreeNode(max);

        int[] left = new int[maxindex];
        for (int i = 0; i < maxindex; i++) {
            left[i] = nums[i];
        }
        node.left = constructMaximumBinaryTree(left);

        int[] right = new int[nums.length - 1 - maxindex];
        for (int i = maxindex + 1; i < nums.length; i++) {
            right[i] = nums[i];
        }
        //this is modified
        node.right = constructMaximumBinaryTree(right);
        return node;
    }
}