package com.congenial.octo.lamp.datastructures.linear;

import java.util.Stack;

import com.congenial.octo.lamp.util.Utility;

public class StackOctos {
    public static void main(String[] args){
        stack_();

    }

    static void stack_(){
        Stack<Integer> stack = new Stack<Integer>();
        Utility.out("Empty: "+stack.isEmpty());

        stack.push(11);
        stack.push(21);
        stack.push(31);
        stack.push(41);
        stack.push(5);
        stack.add(2, 6); // 0-based
        stack.add(6, 7);

        Utility.out("\nStack - before ");
        Utility.out(stack);


        Utility.out("\nPeek LIFO");
        Utility.out(Integer.toString(stack.peek()));

        Utility.out("\nStack - Search 6 Before pop (1-based)");
        Utility.out(Integer.toString(stack.search(6)));
        
        stack.pop();
        Utility.out("\nStack - after pop");
        Utility.out(stack);

        Utility.out("\nStack - Search 6 After pop (1-based)");
        Utility.out(Integer.toString(stack.search(6)));
        

        Utility.out("Empty: "+stack.isEmpty());

    }    
}
