import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * Created by Brady on 5/11/17.
 */
public class StringProblems {

    public static void main(String[] args) {
        //String A,B for testing stringSumLexoCapitalize. S for lettersInRange.
        String A = "Hello";
        String B = "Java";
        String S = "Helloworld";
        //start and end for testing lettersInRange.
        int start = 3;
        int end = 7;
        stringSumLexoCapitalize(A, B);
        lettersInRange(S, start, end);
        //C is for testing ispalindrome
        String C = "madam";
        isPalindrome(C);
    }

    //Takes in two strings A,B prints the sum of their lengths, whether or not A is lexographically larger than B,
    //and the Strings with the first letter capitalized.
    public static void stringSumLexoCapitalize(String A, String B) {
        int sumOfAB = A.length() + B.length();
        System.out.println(sumOfAB);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else if (A.compareTo(B) < 0) {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }

    //Given a string, starting and ending indices, print the substring between them.
    public static void lettersInRange(String S, int start, int end) {
        System.out.println(S.substring(start, end));
    }

    //Given a string print yes if palindrome or no if not.
    public static void isPalindrome(String A) {
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())
                ? "Yes" : "No");

    }
}