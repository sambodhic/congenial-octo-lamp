package com.congenial.octo.lamp.datastructures.linear;

import java.util.Collections;
import java.util.LinkedList;

import com.congenial.octo.lamp.util.Utility;

public class LinkedListOctos {

    public static void main(String[] args) {
        linked_list();
    }

    static void linked_list() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Utility.out("\nFirst item:");
        Utility.out(cars.getFirst());
        Utility.out("\nLast item:");
        Utility.out(cars.getLast());
        Utility.out("\nFirst item:");
        Utility.out(cars.peek());
        Utility.out("\nLast item (and deletes it too):");
        Utility.out(cars.pollLast());

        Utility.out("\nSorted items");

        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            Utility.out(i);
        }

        Utility.out("\nReverse order");

        Collections.sort(cars, Collections.reverseOrder()); // Sort cars
        for (String i : cars) {
            Utility.out(i);
        }

        insertInBeginning(12);
        insertInBeginning(10);
        insertInBeginning(9);
        insertInBeginning(7);
        insertInBeginning(19);

        insertAtEnd(120);
        insertAtEnd(100);
        insertAtEnd(90);
        insertAtEnd(70);
        insertAtEnd(190);

        insertAfterNode(head.next.next.next.next, 33);
        Utility.out("\nAfter insertions");
        Node p = head;
        while (p != null) {
            Utility.out(Integer.toString(p.data));
            p = p.next;
        }

        deleteInBeginning();
        Utility.out("\nAfter deletions at start");
        p = head;
        while (p != null) {
            Utility.out(Integer.toString(p.data));
            p = p.next;
        }

        deleteAtEnd();
        Utility.out("\nAfter deletions at end");
        p = head;
        while (p != null) {
            Utility.out(Integer.toString(p.data));
            p = p.next;
        }

        deleteAtPosition(2);
        Utility.out("\nAfter deletions at end");
        p = head;
        while (p != null) {
            Utility.out(Integer.toString(p.data));
            p = p.next;
        }

        Utility.out("\nReverse Linked List");
        reverseOrder();
        p = head;
        while (p != null) {
            Utility.out(Integer.toString(p.data));
            p = p.next;
        }

        Utility.out("\nRemove nth from last");
        removeNthFromEnd();
        p = head;
        while (p != null) {
            Utility.out(Integer.toString(p.data));
            p = p.next;
        }

    }

    // define Node
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    // define head
    static Node head;

    // add to head
    static void insertInBeginning(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // add to tail
    static void insertAtEnd(int data) {
        Node node = new Node(data);
        Node linkedlist = head;

        while (linkedlist.next != null) {
            linkedlist = linkedlist.next;
        }
        linkedlist.next = node;
    }

    // add in between
    static void insertAfterNode(Node node, int data) {
        Node lk = new Node(data);
        lk.next = node.next;
        node.next = lk;
    }

    static void deleteInBeginning() {
        head = head.next;
    }

    static void deleteAtEnd() {
        Node lk = head;
        while (lk.next.next != null) {
            lk = lk.next;
        }
        lk.next = null;
    }

    static void deleteAtPosition(int pos) {
        Node lk = head;
        while (lk.next.next != null) {
            if (pos == 0) {
                lk.next = lk.next.next;
                break;
            } else {
                pos--;
                lk = lk.next;
            }
        }
    }

    static void reverseOrder() {
        Node cur = head, pre = null;
        while(cur!=null){
            Node temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head = pre;
    }

    static void removeNthFromEnd(){
        Node dummyNode = new Node(0);
        dummyNode.next = head;

        int n=4;

        Node fast = dummyNode;
        Node slow = dummyNode;

        for (int i=1; i<n+1; i++){
            fast = fast.next;
        }

        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        head = dummyNode.next;
        
    }
}
