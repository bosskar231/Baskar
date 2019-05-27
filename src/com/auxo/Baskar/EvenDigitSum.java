package com.auxo.Baskar;
/*
                        EVEN DIGIT SUM
                        Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.


EXAMPLE INPUT/OUTPUT:

* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

* getEvenDigitSum(-22); → should return -1 since the number is negative


NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */
import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        System.out.println(getEvenDigitSum(number));
    }
    public static int getEvenDigitSum(int number)
    {
        if(number>=0)
        {
            int count=-1,sum=0,waste=0;
            while(number!=0)
            {
                if(isEven(number%10))
                {
                    sum+=number%10;
                }
                number/=10;
            }
            return sum;
        }
        return -1;
    }
    public static boolean isEven(int number)
    {
        if(number %2==0) return true;
        return false;
    }
}
