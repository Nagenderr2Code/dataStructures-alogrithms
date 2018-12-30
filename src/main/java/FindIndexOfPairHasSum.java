package main.java;

import java.util.HashMap;
import java.util.Map;

public class FindIndexOfPairHasSum {

    public static void main(String[] args) {

        int[] questionArray = {2, 4, 5, 6, 7};
        int targetSum = 9;

       // int[][] resultIndex = bruteForeMethod(questionArray, targetSum);
        int[][] resultIndex = approach2(questionArray, targetSum);
        System.out.println(resultIndex.toString());
    }

    //TimeComplexity : O(n^2) --> Number of Iteration for each loop which O(n*n)
    // SpaceComplexity : O(n) --> Number of elements Stored in array which stores O(n)
    public static int[][] bruteForeMethod(int[] questionArray, int targetSum) {

        int[] resultIndex;
        int[][] resultIndexs;
        resultIndexs = new int[questionArray.length / 2][2];
        int insertingIndex = 0;
        for (int i = 0; i < questionArray.length; i++) {
            for (int j = i + 1; j < questionArray.length; j++) {
                int indexI = questionArray[i];
                int indexJ = questionArray[j];
                if (targetSum == indexI + indexJ) {
                    resultIndex = new int[]{i, j};
                    resultIndexs[insertingIndex] = resultIndex;
                    insertingIndex++;
                }
            }
        }

        return resultIndexs;
    }

    //TimeComplexity : O(n) --> Number of Iteration for each loop which O(n)
    // SpaceComplexity : O(n) --> Number of elements Stored in array which stores O(n)
    public static int[][] approach2(int[] questionArray, int targetSum) {
        Map<Integer, Integer> complementMap = new HashMap<>();
       // int[] resultIndex;
        int[][] resultIndexs;
        resultIndexs = new int[questionArray.length / 2][];
        int insertingIndex = 0;
        for (int i = 0; i < questionArray.length; i++) {
            int compliment =  targetSum-questionArray[i];
            if (complementMap.containsKey(compliment)) {
                //resultIndex = new int[]{i,complementMap.get(compliment) };
                resultIndexs[insertingIndex]= new int[]{i,complementMap.get(compliment) };
                insertingIndex++;
            }else{
                complementMap.put(questionArray[i],i);
            }
        }
        return resultIndexs;
    }


}
