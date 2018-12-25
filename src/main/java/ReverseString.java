package main.java;

public class ReverseString {

    public static void main(String[] args) {
        String toBeReversed = "My Name is Nagender";
        reverseString(toBeReversed);
        reverseStringWithStringBuilder(toBeReversed);
    }

    public static String reverseString(String toBeReversed) {

        String reversedString = "";

        if (!toBeReversed.isEmpty() && toBeReversed != null) {
            int index = toBeReversed.length()- 1;

            for (int i = index; i >= 0; i--) {
                reversedString = reversedString + toBeReversed.charAt(i);
            }
            System.out.println("Reversed String Using String For:" + reversedString);
        }

        return reversedString;
    }

    public static String reverseStringWithStringBuilder(String toBeReversed) {

        String reversedString = "";

        if (!toBeReversed.isEmpty() && toBeReversed != null) {
          reversedString = new StringBuilder(toBeReversed).reverse().toString();
            System.out.println("Reversed String Using String Builder:" + reversedString);
        }

        return reversedString;
    }
}
