package lesson4;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class triangleAngles {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 values for the angles: ");

        double angle1 = scanner.nextDouble();
        double angle2 = scanner.nextDouble();
        double angle3 = scanner.nextDouble();


        // Valid or not
        if ((angle1 + angle2 + angle3) == 180) {
            System.out.println("Triangle can be built");
//        } else {
//            System.out.println("Triangle cannot be built");
//        }
            // Types of triangles

            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("The triangle is equilateral/равностранен ");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is right-angled/правоъгълен");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("The triangle is obtuse/тъпоъгълен");
            } else {
                System.out.println("The triangle is acute/остроъгълен");
            }
            //isosceles or multifaceted

            if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("The triangle is isosceles/равнобедрен");
            } else {
                System.out.println("The triangle is multifacet/разностранен");
            }
        } else {
            System.out.printf("triangle cannot be built");
        }
    }
}


// what about negative value checks??