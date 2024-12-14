package task_2;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swaping first number is "+num1);
        System.out.println("After swaping second number is "+num2);
    }
}
