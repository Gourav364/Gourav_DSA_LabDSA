package com.learning.brackets;

import com.learning.brackets.BalancedBrackets;

import java.util.Scanner;

public class BalancedBracketsMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter input : ");
        String brackets = sc.next();

        boolean balanced =  BalancedBrackets.compare(brackets, brackets.length());
        if(balanced) {
            System.out.println("The entered String has Balanced Brackets");
            return;
        }

        System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}
