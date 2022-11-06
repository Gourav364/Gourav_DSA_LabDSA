package com.learning.tree;

import java.util.Scanner;

public class TreeMain {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of node in tree: ");
        int totalNode = sc.nextInt();
        for(int i=0; i < totalNode; i++) {
            tree.insert(sc.nextInt());
        }

        System.out.println("Enter target : ");
        int target = sc.nextInt();
        boolean isPairExist  =  tree.pairSum(target);
        if(!isPairExist) System.out.println("nodes are not found.");
    }

}
