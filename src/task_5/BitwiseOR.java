package task_5;

import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2=sc.nextInt();
        int result=num1 | num2;
        System.out.println("Result is :"+result);
    }
}
