package com.congenial.octo.lamp.leetcode;

import java.util.Stack;

public class Lc1472_BrowserHistory {

    public static void main (String[] args){
        Lc1472_BrowserHistory browserHistory = new Lc1472_BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
        browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
        browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    }

    Stack<String> fwd = new Stack<>();
    Stack<String> bck = new Stack<>();

    public Lc1472_BrowserHistory(String homepage) {
        bck.push(homepage);
        fwd.clear();
    }
    
    public void visit(String url) {
        bck.push(url);
        fwd.clear();
    }
    
    public String back(int steps) {
        while (bck.size()>1 && steps>0){
            fwd.push(bck.pop());
            steps--;
        }
        return bck.peek();        
    }
    
    public String forward(int steps) {
        while (fwd.size()>0 && steps>0){
            bck.push(fwd.pop());
            steps--;
        }
        return bck.peek();     
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */