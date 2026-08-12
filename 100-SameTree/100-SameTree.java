// Last updated: 12/08/2026, 11:26:29
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both null -> same
        if (p == null && q == null) return true;
        // One null, one not -> not same
        if (p == null || q == null) return false;
        // Compare values, then left & right subtrees
        return (p.val == q.val) &&
               isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}