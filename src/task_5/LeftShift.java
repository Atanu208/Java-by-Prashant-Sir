package task_5;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num1=sc.nextInt();

        int result=num1 << 1;
        System.out.println("Result is :"+result);
    }
}
