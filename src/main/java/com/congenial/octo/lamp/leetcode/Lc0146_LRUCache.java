package com.congenial.octo.lamp.leetcode;

import java.util.HashMap;

public class Lc0146_LRUCache {

    Node head = new Node();
    Node tail = new Node();
    HashMap<Integer, Node> node_map;
    int cache_capacity;

    public static void main(String[] args) {

        Lc0146_LRUCache lru = new Lc0146_LRUCache(2);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.get(1);
        lru.put(3, 3);
        lru.get(2);
        lru.put(4, 4);
        lru.get(1);
        lru.get(3);
        lru.get(4);
        System.out.println("");
    }

    public Lc0146_LRUCache(int capacity) {
        cache_capacity = capacity;
        node_map = new HashMap<>(cache_capacity);
        head.next = tail;
        tail.prev = head;
        System.out.print("null,");
    }

    public int get(int key) {
        int result = -1;
        Node node = node_map.get(key);
        if (node != null) {
            result = node.key;
            remove(node);
            add(node);
        }
        System.out.print(result+",");
        return result;
    }

    public void put(int key, int value) {
        Node node = node_map.get(key);

        if (node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if (node_map.size() == cache_capacity) {
                node_map.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            node_map.put(key, new_node);
            add(new_node);
        }
        System.out.print("null,");

    }

    public void add(Node node) {
        Node head_node = head.next;

        head_node.prev = node;
        node.next = head_node;
        node.prev = head;
        head.next = node;
    }

    public void remove(Node node) {
        Node prev_node = node.prev;
        Node next_node = node.next;

        prev_node.next = next_node;
        next_node.prev = prev_node;
    }

    class Node {
        int key;
        int val;
        Node next;
        Node prev;
    }

}