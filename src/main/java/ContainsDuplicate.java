package main.java;

import sun.awt.image.IntegerInterleavedRaster;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        Integer[] inputArray = {1,2,3,1};

        boolean containsDuplicate= containDuplicate(inputArray);
        System.out.println("Found the Duplicates::" + containsDuplicate);
    }

    public static boolean containDuplicate( Integer[] inputArray){

        if(inputArray.length ==0){
            return false;
        }

        Set<Integer> resultSet = new HashSet<>(Arrays.<Integer>asList(inputArray));
        if(resultSet.size() == inputArray.length){
            return false;
        }else{
            return true;
        }
    }
}
