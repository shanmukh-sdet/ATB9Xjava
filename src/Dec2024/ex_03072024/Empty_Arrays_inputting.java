package Dec2024.ex_03072024;

import java.util.Scanner;

public class Empty_Arrays_inputting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int [] numbers = new int[size];

        for (int i=0;i< size ; i++){
            System.out.println("Enter the number"+(i+1));
            numbers[i] = sc.nextInt();
        }
        System.out.println("---");

        System.out.println("the numbers are");
        for (int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

}
