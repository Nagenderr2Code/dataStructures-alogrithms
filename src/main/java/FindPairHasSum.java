package main.java;

import java.util.*;

public class FindPairHasSum {

    public static void main(String[] args) {
        int[] inputArray = {1, 3, 4, 6};

        System.out.println("Found the sum expected with O(n^2)." + findSumWithON(inputArray, 8));

        System.out.println("Found the sum expected with O(n)." + findSum(inputArray, 8));
    }

    // Big O notation of below function is O(n^2)
    // This has nested for-loop as the input grows execution time will grow. Time Complexity
    public static boolean findSumWithON(int[] input, int sum) {

        int length = input.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (input[i] + input[j] == sum)
                    return true;
            }
        }
        return false;
    }

    //[2, 4, 4, 6]--[8]

    // Big O notation of below function is O(n)
    // This has for-loop as the input grows execution time will grow. Time Complexity
    public static boolean findSum(int[] input, int sum) {

        Set<Integer> mySet = new HashSet<>();
        List<Integer> resultSet= null;
        Set<List> resultList= new HashSet<>();
        int length = input.length;
        for (int i = 0; i < length; i++) {
            if (mySet.contains(input[i])) {
                resultSet = new ArrayList<>();
                resultSet.add(sum - input[i]);
                resultSet.add(input[i]);
                resultList.add(resultSet);
            }
            mySet.add(sum - input[i]); //[2, 4, 4, 6]--[6,4]
        }

        if (!resultList.isEmpty()) {
            System.out.println(resultList.toString());
            return true;
        }
        return false;
    }

}