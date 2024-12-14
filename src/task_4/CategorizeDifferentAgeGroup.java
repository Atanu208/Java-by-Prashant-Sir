package task_4;

import java.util.Scanner;

public class CategorizeDifferentAgeGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        if(age <= 13) System.out.println("Child");
        else if(age <= 20) System.out.println("Teen");
        else if(age <= 60) System.out.println("Adult");
        else System.out.println("Senior");
    }
}
