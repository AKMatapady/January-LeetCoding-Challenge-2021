/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
//     private boolean recur(final TreeNode original, final TreeNode cloned, final TreeNode target)
//     {
        
//     }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original != null & target != null)
        {
            if (original == target)
                return cloned;
            TreeNode left = getTargetCopy(original.left, cloned.left, target);
            if(left != null)
                return left;
            return getTargetCopy(original.right, cloned.right, target);
        }
        return null;
    }
}