package main.java;

public class RotateArray {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        rotateArray(inputArray, 2);
    }


    public static int[] rotateArray(int[] nums, int k) {
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index= (i + k) % nums.length;
            resultArray[index] = nums[i];
        }
        return resultArray;
    }
}
