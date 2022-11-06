package com.learning.tree;

import java.util.HashSet;
import java.util.Set;

public class Tree {

    private TNode root;

    public void insert(int data) {
        this.root = insert(this.root, data);
    }

    private TNode insert(TNode root, int data) {

         if(root == null) {
             return new TNode(data);
         }

         if(data <= root.getData())
             root.setLeft(insert(root.getLeft(), data));
         else
             root.setRight(insert(root.getRight(), data));

         return root;
    }


    public boolean pairSum(int target) {
        Set<Integer> dataSet = new HashSet<>();
        return pairSum(this.root, target, dataSet);
    }

    private boolean pairSum(TNode root, int target, Set<Integer> dataSet) {

        if(root == null) return false;

        int setVal = target - root.getData();
        if(dataSet.contains(setVal)) {
            System.out.println("Pair is : " + root.getData() + ", " + setVal);
            return true;
        }

        dataSet.add(root.getData());
        boolean isPairExist = pairSum(root.getLeft(), target, dataSet);
        if(isPairExist) return true;

        isPairExist = pairSum(root.getRight(), target, dataSet);

        return isPairExist;
    }
}
