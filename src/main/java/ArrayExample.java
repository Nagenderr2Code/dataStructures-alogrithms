package main.java;

public class ArrayExample {

    public static void main(String[] args) {
         String[] strings = new String[10];
         strings[0]="a";
         strings[1]="b";
         strings[3]="d";

         for (String item : strings) {
             System.out.println(item);
         }
         strings[2] ="c";
    }
}
