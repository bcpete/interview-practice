import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * Created by Brady on 5/11/17.
 */
public class StringProblems {

    public static void main(String[] args) {


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

    //Given an integer, N , print its first 10 multiples. Each multiple Nxi (where1<i<10 ) should be printed on a new line in the form: N x i = result.
    public static void printMultiples(int N) {
        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }

    //Given a string, s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
    // We define a token to be one or more consecutive English alphabetic letters.
    // Then, print the number of tokens, followed by each token on a new line.
    public static void splitOnToken(String s){
        String splitChars = "[ .,?!'/><()@#$%^&*]+";
        String[] answer = s.split(splitChars);
        System.out.println(answer.length);
        for(String string : answer){
            System.out.println(string);
        }
    }

}