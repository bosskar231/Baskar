package com.auxo.Baskar;
/*
                        NUMBER IN WORDS

                        Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.


NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

NOTE: Do not add main method to solution code.
 */
import java.util.Scanner;

public class NumberInWord {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNumberInWord(number);
    }

    public static void printNumberInWord(int number) {
        String Numbers[] = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "OTHER"};
        System.out.println((number <= 9 && number >= 0) ? Numbers[number] : Numbers[Numbers.length - 1]);
    }
}
