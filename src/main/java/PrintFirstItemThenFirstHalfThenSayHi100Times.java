package main.java;

public class PrintFirstItemThenFirstHalfThenSayHi100Times {

    public static void main(String[] args) {

        String[] arg = {"a", "b", "c", "d", "e"};
        print(arg);
    }

    // Big O notation for this will be O(n) as per rule 1 & 2
    //Rule 1: Always worst Case
    //Rule 2: Remove Constants
    public static void print(String[] arg) {
        System.out.println(arg[0]);
        int index = 0;
        while (index < Math.round(arg.length / 2)) {
            System.out.println(arg[index]);
            index++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Printing Hi");
        }
    }
}
