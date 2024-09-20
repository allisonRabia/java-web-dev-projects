package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        //double areaOfCircle = (3.14 * (radius * radius));
        System.out.println("The area of a radius " + radius + " is: " + Circle.getArea(radius));
    input.close();


    }


}