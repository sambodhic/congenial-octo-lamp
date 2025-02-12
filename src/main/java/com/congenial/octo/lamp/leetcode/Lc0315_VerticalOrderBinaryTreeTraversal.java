package com.congenial.octo.lamp.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import com.congenial.octo.lamp.util.TreeNode;
import com.congenial.octo.lamp.util.Utility;


public class Lc0315_VerticalOrderBinaryTreeTraversal {
    public static void main(String[] args) {
        Integer[] rootArr = {3,9,20,(Integer) null,(Integer) null,15,7};
        TreeNode root = (TreeNode) Utility.buildTree(rootArr);
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            System.out.println(res);
            return;
        }
        
        Map<Integer, ArrayList<Integer>> tm = new TreeMap<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();

        nodes.add(root);
        cols.add(0);

        while(!nodes.isEmpty()){
            TreeNode node = nodes.poll();
            int col = cols.poll();

            ArrayList<Integer> arr = tm.getOrDefault(col, new ArrayList<Integer>()); 
            arr.add(node.val);
            tm.put(col,arr);

            if (node.left != null){
                nodes.add(node.left);
                cols.add(col-1);
            }
            if (node.right != null){
                nodes.add(node.right);
                cols.add(col+1);
            }
        }

        for (ArrayList<Integer> arr: tm.values()){
            res.add(arr);
        }

        System.out.println(res);
    }
}
