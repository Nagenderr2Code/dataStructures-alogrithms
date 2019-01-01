package main.java;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringValue {

    public static void main(String[] args) {

        int[] inputArray = {2,1,1,2,3,5,1,2,4};
        firstRecurringValue(inputArray);
    }

    static void firstRecurringValue(int[] inputArray){

        Map<Integer, Integer> resultingMap= new HashMap<>();
        int firstRecurringValue=0;
        boolean found= false;
        for(int i=0; i<inputArray.length; i++){
            if(resultingMap.containsKey(inputArray[i])){
                found= true;
                firstRecurringValue=inputArray[i];
                break;
            }else{
                resultingMap.put(inputArray[i],i);
            }
        }

        if(found){
            System.out.println("First Recurring value "+firstRecurringValue);
        }
    }
}
