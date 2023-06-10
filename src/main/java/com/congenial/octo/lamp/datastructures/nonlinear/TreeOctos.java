package com.congenial.octo.lamp.datastructures.nonlinear;

import java.util.*;

import com.congenial.octo.lamp.util.Utility;

public class TreeOctos {

        // Driver code
    public static void main(String[] args) {
        vectorTree();
    }

    static void vectorTree(){
        // Number of nodes
        int N = 7, Root = 1;

        // Adjacency list to store the tree
        Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new Vector<Integer>());
        }

        // Creating the tree
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(1).add(4);
        adj.get(4).add(1);

        adj.get(2).add(5);
        adj.get(5).add(2);

        adj.get(2).add(6);
        adj.get(6).add(2);

        adj.get(4).add(7);
        adj.get(7).add(4);

        // Printing the parents of each node
        Utility.out("The parents of each node are:");
        printParents(Root, adj, 0);

        // Printing the children of each node
        Utility.out(
                "The children of each node are:");
        printChildren(Root, adj);

        // Printing the leaf nodes in the tree
        Utility.out(
                "The leaf nodes of the tree are:");
        printLeafNodes(Root, adj);

        // Printing the degrees of each node
        Utility.out("The degrees of each node are:");
        printDegrees(Root, adj);

    }

    // Function to print the parent of each node
    public static void printParents(int node, Vector<Vector<Integer>> adj,
            int parent) {

        // current node is Root, thus, has no parent
        if (parent == 0)
            Utility.out(node + "->Root");
        else
            Utility.out(node + "->" + parent);

        // Using DFS
        for (int i = 0; i < adj.get(node).size(); i++)
            if (adj.get(node).get(i) != parent)
                printParents(adj.get(node).get(i), adj,
                        node);
    }

    // Function to print the children of each node
    public static void printChildren(int Root, Vector<Vector<Integer>> adj) {

        // Queue for the BFS
        Queue<Integer> q = new LinkedList<>();

        // pushing the root
        q.add(Root);

        // visit array to keep track of nodes that have been
        // visited
        int vis[] = new int[adj.size()];

        Arrays.fill(vis, 0);

        // BFS
        while (q.size() != 0) {
            int node = q.peek();
            q.remove();
            vis[node] = 1;
            Utility.out(node + "-> ");

            for (int i = 0; i < adj.get(node).size(); i++) {
                if (vis[adj.get(node).get(i)] == 0) {
                    Utility.out(adj.get(node).get(i)
                            + " ");
                    q.add(adj.get(node).get(i));
                }
            }
            Utility.out("\n");
        }
    }

    // Function to print the leaf nodes
    public static void printLeafNodes(int Root, Vector<Vector<Integer>> adj) {

        // Leaf nodes have only one edge and are not the
        // root
        for (int i = 1; i < adj.size(); i++)
            if (adj.get(i).size() == 1 && i != Root)
                Utility.out(i + " ");

        Utility.out("\n");
    }

    // Function to print the degrees of each node
    public static void printDegrees(int Root, Vector<Vector<Integer>> adj) {
        for (int i = 1; i < adj.size(); i++) {
            Utility.out(i + ": ");

            // Root has no parent, thus, its degree is
            // equal to the edges it is connected to
            if (i == Root)
                Utility.out(adj.get(i).size());
            else
                Utility.out(adj.get(i).size() - 1);
        }
    }

}