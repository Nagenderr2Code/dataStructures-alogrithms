package main.java;

public class PairsOfArray {

    public static void main(String[] args) {

        String[] arg = {"a", "b", "c", "d", "e"};
        print(arg);
    }

    // Big O notation for this will be O(n^2)

    /**
     * Rule 3: Different inputs should have different variables. O(a+b). A and B arrays nested would be
     * O(a*b)
     * + for steps in order
     * for nested steps
     */
    public static void print(String[] arg) {

        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg.length; j++) {
                System.out.println(arg[i] + " ," + arg[j]);
            }
        }
    }
}
