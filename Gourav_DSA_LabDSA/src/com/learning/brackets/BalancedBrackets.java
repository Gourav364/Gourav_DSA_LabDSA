package com.learning.brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static boolean compareUsingTwoPointer(String brackets, int n) {

        if (n == 0) return true;
        if (n % 2 != 0) return false;

        int i = 0, j = n - 1;

        while (i < n) {
            char chl = brackets.charAt(i++);
            char chr = brackets.charAt(j--);
            if ((chr == ')' && chl != '(') || (chr == '}' && chl != '{')
                    || (chr == ']' && chl != '[')) {
                return false;
            }
        }
        return true;
    }

    public static boolean compare(String brackets, int n) {

        if (n == 0) return true;

        if (n % 2 != 0) return false;
        Deque<Character> myStack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {

            char ch = brackets.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                myStack.push(ch);
            } else {
                if (myStack.isEmpty() || (ch == ')' && myStack.peek() != '(') || (ch == '}' && myStack.peek() != '{')
                        || (ch == ']' && myStack.peek() != '[')) {
                    return false;
                }

                myStack.pop();
            }
        }

        return myStack.isEmpty();
    }
}
