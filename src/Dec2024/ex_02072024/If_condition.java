package Dec2024.ex_02072024;

import java.util.Scanner;

public class If_condition {
    public static void main(String[] args){
        //program to print gradewise 90-100 - A
        //80-89 -B
        //70-79 - c
        //60-69 -D
        //0-59 - F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <= 100){
            grade ='A';
        } else if (score >=80 && score <=89) {
            grade = 'B';
        } else if (score >=70 && score <=79) {
            grade = 'C';
        }else if (score >=60 && score <=69) {
            grade = 'D';
        } else if (score <=0 || score >= 100) {
            System.out.println("You have entered invalid score");
            grade = 'O';
        } else {
        grade = 'F';
        }
        System.out.println("your grade is->"+grade);
    }


    }
