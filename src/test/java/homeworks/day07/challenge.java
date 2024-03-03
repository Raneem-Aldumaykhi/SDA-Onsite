package homeworks.day07;

import org.junit.Assert;

public class challenge {
    public static void main(String[] args) {


              /*  String originalString = "Raneem";

                // Using StringBuilder to reverse the string
                StringBuilder reversedString = new StringBuilder(originalString);
                reversedString.reverse();

                System.out.println("Original String: " + originalString);
                System.out.println("Reversed String: " + reversedString.toString());*/



              String original = "Raneem";
              String reverse = "";

              // Traverse the original string from end to start
              for (int i = original.length() - 1; i >= 0; i--) {
                  // Append each character to the reversedString
                  reverse += original.charAt(i);
              }

              System.out.println("Original String: " + original);
              System.out.println("Reversed String: " + reverse);
    }
}



