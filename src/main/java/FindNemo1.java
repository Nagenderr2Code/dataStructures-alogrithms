package main.java;

public class FindNemo1 {

    public static void main(String[] args) {
        //String[] nemoArray = {"nemo"}; //0(1) executes only ones
        String[] nemoArray = {"dory", "bruce", "truce", "nemo"}; //0(1) executes only ones

        int i = findNemo(nemoArray);

        System.out.println("Loop Ran.." + i + " Times ");
    }

    public static int findNemo(String[] nemoArray) {
        int i;
        for (i = 0; i < nemoArray.length; i++) { //0(nemoArray.length of times) executes only ones
            if ("nemo".equalsIgnoreCase(nemoArray[i])) { //0(nemoArray.length of times) executes only ones
                System.out.println(" Found Nemo"); //0(nemoArray.length of times) executes only ones
            }
        }
        // Big O notation for this program is O(1) if nemoArray.length =1
        // Big O notation for this program is O(n) if nemoArray.length >1
        return i;
    }
}
