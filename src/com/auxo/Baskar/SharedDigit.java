package com.auxo.Baskar;
/*
                        SHARED DIGIT


                        Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:

* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers


NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        System.out.println(hasSharedDigit(number1,number2));
    }
    public static  boolean  hasSharedDigit(int number1,int number2)
    {
        if (isRange(number1) && isRange(number2)) {
            String no= String.valueOf(number1);
            String no1= String.valueOf(number2);
            System.out.println(no);
            System.out.println(no1);
            for(int i=0;i<no.length();i++)
            {

                //System.out.println(no.charAt(i));

                if(no1.indexOf(String.valueOf(no.charAt(i)))>=0)
                {
                    return true;
                }
            }


        }
        return false;

    }
    public static boolean isRange(int number)
    {
        if(number>=10 && number <=99)
        {
            return true;
        }
        return false;
    }
}

