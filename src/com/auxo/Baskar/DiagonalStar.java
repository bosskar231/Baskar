package com.auxo.Baskar;
/*
                        DIAGONAL STAR
                        Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).


EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****


Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********


The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

* In the first or last row

* In the first or last column

* When the row number equals the column number

* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)


HINT: Use a nested loop (a loop inside of a loop).

HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.

HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .

NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
 */
import java.util.Scanner;

public class DiagonalStar {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        printSquareStar(number);

    }

    public static void printSquareStar(int number) {
        if (isValid(number)) {

            PrintingStar(number);


        } else {
            System.out.println("Invalid Value");
        }

    }

    public static void PrintingStar(int number) {
        int rowCount = 1, columnCount = number - 2;
        for (int i = 0; i < number; i++) {
            for (int k = 0; k < number; k++) {
                if (i == 0 || k == 0 || i == number - 1 || k == number - 1) {//In the first or last row or column

                    System.out.print("*");
                    continue;
                } else if (i == k) {//when row number equals column number
                    System.out.print("*");
                    continue;
                } else if (k == number - (i + 1)) {//column number equals rowcount - currentrow +1
                    System.out.print("*");
                    continue;

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }



    public static boolean isValid(int number) {
        if (number >= 5) {
            return true;
        }
        return false;
    }
}
