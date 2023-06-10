package com.congenial.octo.lamp.datastructures.linear;

import java.util.LinkedList;
import java.util.Queue;

import com.congenial.octo.lamp.util.Utility;

public class QueueOctos {
    public static void main(String[] args) {
        queue();
    }

    static void queue() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(6);
        q.add(1);
        q.add(8);
        q.add(4);
        q.add(7);

        Utility.out(q);

        Utility.out("\nPeek FIFO");
        Utility.out(q.peek());

        q.remove(8);
        q.remove();
        Utility.out(q);

    }
}
