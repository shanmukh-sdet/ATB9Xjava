package Dec2024.ex_03072024;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("Enter the num2");
        int b = sc.nextInt();

        int result_add = sum_of_two_numbers(a,b);
        System.out.println("sum is ->"+result_add);

        int result_sub = sub_of_two_numbers(a,b);
        System.out.println("sub is->"+result_sub);

        int result_mult = mult_of_two_numbers(a,b);
        System.out.println("mult is ->"+result_mult);

        int result_mod = mod_of_two_numbers(a,b);
        System.out.println("mod is ->"+result_mod);


        sc.close();
    }

     static int mod_of_two_numbers(int a, int b) {
        return a%b;
    }

    static int mult_of_two_numbers(int a, int b) {
        return a*b;
    }

    static int sub_of_two_numbers(int a, int b) {
        return a-b;
    }

    static int sum_of_two_numbers(int a, int b) {
        return a+b;
    }
}
