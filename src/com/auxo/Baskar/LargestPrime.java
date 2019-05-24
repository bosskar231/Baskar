package com.auxo.Baskar;
/*
                                LARGEST PRIME

                                Write a method named getLargestPrime with one parameter of type int named number.

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.


The method should calculate the largest prime factor of a given number and return it.


EXAMPLE INPUT/OUTPUT:

* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

* getLargestPrime (0); should return -1 since 0 does not have any prime numbers

* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

* getLargestPrime (-1); should return -1 since the parameter is negative


HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */
import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(getLargestPrime(number));

    }

    public static int getLargestPrime(int number) {
        if (isValid(number)) {
            // System.out.println("yes valid");
            for (int i = number / 2; i >= 1; i--) {
                // System.out.println("i is "+ i);
                if (number % i == 0 && isPrime(i)) {
                    return i;
                }
            }

        }

        return -1;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(int number) {
        if (number > 1) {
            return true;
        }
        return false;
    }
}
