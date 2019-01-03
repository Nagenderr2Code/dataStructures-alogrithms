package main.java;

import java.util.ArrayList;
import java.util.List;

public class OptimalTravelDistance {

    public static void main(String[] args) {
        List<int[]> forwardRoute= new ArrayList<>();
        int[] firstCord= {1,3000};
        int[] secondCord= {2,5000};
        int[] thirdCord= {3,7000};
        int[] forthCord= {4,10000};
        forwardRoute.add(firstCord);
        forwardRoute.add(secondCord);
        forwardRoute.add(thirdCord);
        forwardRoute.add(forthCord);


        int[] firstCordR= {1,2000};
        int[] secondCordR= {2,3000};
        int[] thirdCordR= {3,4000};
        int[] forthCordR= {4,5000};
        List<int[]> reverseRoute= new ArrayList<>();
        reverseRoute.add(firstCordR);
        reverseRoute.add(secondCordR);
        reverseRoute.add(thirdCordR);
        reverseRoute.add(forthCordR);

        optimalTravelDistance(9000,forwardRoute, reverseRoute );

    }


    static List<int[]> optimalTravelDistance(int maxTravelDistance, List<int[]> forwardRoute, List<int[]> reverseRoute) {

        List<int[]> resultCord = new ArrayList<>();

        int optimalFound=0;
        int maxFound=0;
        int[] minOptimal = new int[2];
        for(int i=0; i<forwardRoute.size(); i++){
            int[] fwdRoute= forwardRoute.get(i);
            for(int j=0; j<reverseRoute.size();j++){
                int[] revRoute= reverseRoute.get(j);
                int optimalDist= fwdRoute[1]+ revRoute[1];
                if(optimalDist == maxTravelDistance){
                    optimalFound=maxTravelDistance;
                    int[] iCord= {fwdRoute[0], revRoute[0]};
                    resultCord.add(iCord);
                }else if(optimalFound==0 && optimalDist>maxFound){
                    minOptimal[0]=fwdRoute[0];
                    minOptimal[1]=revRoute[0];
                    maxFound=optimalDist;
                }
            }
        }

        if(optimalFound==0 && minOptimal.length>0){
            resultCord.add(minOptimal);
        }

        return resultCord;
    }
}
