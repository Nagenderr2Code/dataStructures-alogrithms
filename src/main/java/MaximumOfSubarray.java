package main.java;

public class MaximumOfSubarray {

    public static void main(String[] args) {

        int[] inputArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxOfArray(inputArray);
        System.out.println("Max Of Sub Array::" + maxSum);
    }

    public static int maxOfArray(int[] inputArray) {

        int maxSum = 0;
        if (inputArray.length == 0) {
            return maxSum;
        }
        int localMax = inputArray[0];
        maxSum = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            localMax = Math.max(inputArray[i] + localMax, inputArray[i]);
            maxSum = Math.max(maxSum, localMax);
        }

        return maxSum;
    }
}
