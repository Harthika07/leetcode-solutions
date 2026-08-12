// Last updated: 12/08/2026, 11:26:30

import java.util.*;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    // Simple recursive function
    public void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inorder(node.left, result);       // Visit left subtree
        result.add(node.val);             // Visit root
        inorder(node.right, result);      // Visit right subtree
    }
}