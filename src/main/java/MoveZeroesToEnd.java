package main.java;

import java.util.Arrays;
import java.util.Vector;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        Integer[] inputString = {0, 1, 0, 3, 12, 0, 4, 6};

        long startTime = System.currentTimeMillis();
        System.out.println("Start Time.." + System.currentTimeMillis());
        Vector<Integer> result = moveElementsToEnd(inputString, 0);
        long endTime = System.currentTimeMillis();
        System.out.println("Result Vector:Time Taken:" + (endTime - startTime) + "::" + result.toString());
    }

    //TimeComplexity : O(n)
    //SpaceComplexity :O(1) -- I belive..Please correct me
    //Using Vector to acheive this as we can easily remove and add the element.
    public static Vector moveElementsToEnd(Integer[] inputArray, int elementToBeMoved) {

        Vector<Integer> inputVector;
        //Checking the 0 && 1 length as we dont have to do any operation
        // if it is 0 we can have proper handling
        if (inputArray.length == 0) {
            return null;
        } else if (inputArray.length == 1) {
            return new Vector<Integer>(Arrays.<Integer>asList(inputArray));
        }

        //type casting the inputArray to Vector
        inputVector = new Vector<Integer>(Arrays.<Integer>asList(inputArray));
        int size = inputVector.size();
        for (int i = 0; i < size; ) {
            if (inputVector.get(i) == elementToBeMoved) {
                inputVector.remove(i);
                inputVector.insertElementAt(elementToBeMoved, inputVector.size());
                //Size of the iteration is decreased. So that it does not iterate the last elements again.
                size--;
            } else {
                //Increment only element is not swapped
                i++;
            }
        }
        return inputVector;
    }
}
