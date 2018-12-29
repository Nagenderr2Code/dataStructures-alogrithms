package main.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] firstArray= {1, 2, 5, 6};
        int[] secondArray = {7, 8, 9, 10};

        mergeArrayJava8(firstArray,secondArray);
        int [] result= mergeArray(firstArray,secondArray);
        System.out.println(result.toString());
    }

    public static List<Integer> mergeArrayJava8(int[] firstArray, int[] secondArray){

        List<Integer> firstList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());

        secondList.forEach(o -> {
            firstList.add(o);
        });

        firstList.sort(Comparator.naturalOrder());

        firstList.forEach(System.out::println);
        return firstList;
    }

    public static int[] mergeArray(int[] firstArray, int[] secondArray){

        int firstArrayLength= firstArray.length;
        int secondArrayLength= secondArray.length;

        if(firstArrayLength<=0 ){
            return secondArray;
        }

        if(secondArrayLength<=0 ){
            return firstArray;
        }

        int resultSize= (firstArrayLength + secondArrayLength)-1;
        int [] result= new int[resultSize];
        int j=0;
        int resultIndex=0;
        //{1, 2, 5, 7} && {1, 4, 6, 7}
        for(int i=0 ; i< firstArrayLength ;){
            if(firstArray[i] <secondArray[j]){
                result[resultIndex]=firstArray[i];
                i++;
                resultIndex++;
            }else if(firstArray[i] == secondArray[j]){
                result[resultIndex]=firstArray[i];
                resultIndex++;
                result[resultIndex]=firstArray[j];
                resultIndex++;
                i++;
                j++;
            }else{
                if(j != secondArrayLength-1){
                    result[resultIndex]=secondArray[j];
                    resultIndex++;
                    j++;
                }else{
                    result[resultIndex]=secondArray[i];
                }

            }
        }


        return result;
    }
}
