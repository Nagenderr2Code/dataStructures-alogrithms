package main.java;

import java.util.*;

public class OptimizedDeliveryPlan {

    public static void main(String[] args) {

        List<int[]> allLocations= new ArrayList<>();
        int[] firstCord= {1,2};
        int[] secondCord= {3,4};
        int[] thirdCord= {1,-1};
        allLocations.add(firstCord);
        allLocations.add(secondCord);
        allLocations.add(thirdCord);
        optimizedPlan(3, allLocations, 3);
    }

    //numDest :- Total number of Possible Deliveries
    //allLocations :- list of elements where each element is pair of integers, x & Y co-ordinates
    //numDeliveries :- number of deliveries that will be delivered
    static List<int[]> optimizedPlan(int numDest, List<int[]> allLocations, int numDeliveries ){

        List<int[]> optimizedCord= new LinkedList<>();

        if(numDeliveries<= numDest){
            Map<Double, Integer> caculatedValue= new LinkedHashMap<>();
            List<Double> value = new ArrayList<>();
            for(int[] cord: allLocations){
                double localVal= Math.sqrt(Math.pow(cord[0], 2)+ Math.pow(cord[1],2));
                caculatedValue.put(localVal, allLocations.indexOf(cord));
                value.add(localVal);
            }

           Collections.sort(value);

            for(int i=0; i<= numDeliveries-1; i++){
                optimizedCord.add(allLocations.get(caculatedValue.get(value.get(i))));
            }

        }

        return optimizedCord;
    }
}
