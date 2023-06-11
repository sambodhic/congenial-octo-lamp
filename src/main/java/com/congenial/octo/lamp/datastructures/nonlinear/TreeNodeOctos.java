package com.congenial.octo.lamp.datastructures.nonlinear;

import com.congenial.octo.lamp.util.Utility;

public class TreeNodeOctos {

    public static void main(String[] args) {

        binary_tree();

    }

    static void binary_tree() {

        // TreeNode root = new TreeNode(1, null, null);
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(6);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        root2.right.left.left = new TreeNode(1);
        root2.right.left.right = new TreeNode(6);

        TreeNode root3 = new TreeNode(5);
        root3.right = new TreeNode(1);
        root3.left = new TreeNode(4);
        root3.left.right = new TreeNode(3);
        root3.left.left = new TreeNode(6);
        root3.left.right.right = new TreeNode(1);
        root3.left.right.left = new TreeNode(6);

        TreeNode root4 = new TreeNode(5);
        root4.left = new TreeNode(1);
        root4.right = new TreeNode(4);

        Utility.out("\nFind max depth of a tree");
        Utility.out(maxDepth(root));

        Utility.out("\nAre they identical trees");
        Utility.out(isSameTree(root, root2));

        Utility.out("\nInvert Tree - root3... is now identical to root2 ?");
        Utility.out(isSameTree(invertTree(root3), root2));

        Utility.out("\nIs root4 subtree of root2 ?");
        Utility.out(isSubtree(root2, root4));

    }

    static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    static boolean isSubtree(TreeNode parentRoot, TreeNode childRoot) {
        if (parentRoot == null) {
            return false;
        }
        if (isSameTree(parentRoot, childRoot)) {
            return true;
        }
        return isSubtree(parentRoot.left, childRoot) || isSubtree(parentRoot.right, childRoot);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
