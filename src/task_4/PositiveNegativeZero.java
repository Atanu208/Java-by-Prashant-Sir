package task_4;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num1=sc.nextInt();
        if(num1>0) System.out.println("Number is positive");
        else if (num1<0) System.out.println("Number is negative");
        else System.out.println("Number is zero");
    }
}
