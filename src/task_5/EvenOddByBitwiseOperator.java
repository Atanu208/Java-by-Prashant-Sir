package task_5;

import java.util.Scanner;

public class EvenOddByBitwiseOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1=sc.nextInt();
        if((num1 & 1) == 1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
