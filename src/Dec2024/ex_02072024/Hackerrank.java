package Dec2024.ex_02072024;

import java.util.Scanner;

public class Hackerrank {
    public static void main(String[] args) {
        //Display an equilateral triangle if all sides are equal
        //Display an Isosceles triangle if two sides are equal
        //Display as scalene triangle is no sides are equal

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        double side1=sc.nextDouble();
        System.out.println("Enter the length of side 2: ");
        double side2=sc.nextDouble();
        System.out.println("Enter the length of side 3: ");
        double side3=sc.nextDouble();

        if (side1 <=0 || side2 <=0 || side3 <=0){
            System.out.println("Invalid input,enter valid length");
        } else if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("It is equilateral Triangle");
        } else if (side1 ==side2 || side2 == side3 || side1 == side3) {
            System.out.println("It is Isosceles triangle");
        } else{
            System.out.println("It is scalene triangle");
        }
        sc.close();


    }

}
