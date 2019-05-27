package com.auxo.Baskar.oops1;
/*
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.

1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.

The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.

Write the following methods (instance methods):

* Method named getArea without any parameters, it needs to return the calculated area (width * length).


2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.

The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.

In case the cost parameter is less than 0 it needs to set the cost field value to 0.

Write the following methods (instance methods):

* Method named getCost without any parameters, it needs to return the value of cost field


3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.

The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.

Write the following methods (instance methods):

* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.


TEST EXAMPLE

→ TEST CODE:

Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

→ OUTPUT

total= 38.5
total= 36.45


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 3 classes.

NOTE: Do not add a main method to the solution code.
 */

import java.util.Scanner;

public class CarpetCostCalculator {
    public static void main(String[] args) {
        char choice = 'y';
        Scanner scanner = new Scanner(System.in);

        while (choice == 'y' || choice == 'Y') {

            System.out.println("enter the width and length");
            Floor floor;
            Calculator calculator;
            Carpet carpet;
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            floor = new Floor(width, height);
            System.out.println("enter the cost");
            double cost = scanner.nextDouble();
            carpet = new Carpet(cost);
            calculator = new Calculator(floor, carpet);
            System.out.println("Total cost " + calculator.getTotalCost());
            System.out.println("do you want to continue\n y or n");
            choice = scanner.next().charAt(0);
        }

    }

}
class Floor
{
    double width;
    double length;
    Floor(double width,double length)
    {
        this.width=isValid(width)?width:0;
        this.length=isValid(length)?length:0;
    }
    public boolean isValid(double value)
    {
        if(value>=0)
        {
            return true;
        }
        return false;
    }
    public double getArea()
    {
        return width*length;
    }
}
class Carpet
{
    double cost;
    Carpet(double cost)
    {
        this.cost=cost>=0?cost:0;
    }
    public double getCost()
    {
        return cost;
    }
}
class Calculator
{
    Floor floor;
    Carpet carpet;
    Calculator(Floor floor,Carpet carpet)
    {
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost()
    {
        return (this.floor.length*this.floor.width)*this.carpet.cost;
    }
}
