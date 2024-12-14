package task_3;

import java.util.Scanner;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        float number1=sc.nextFloat();
        System.out.println("Enter second number : ");
        float number2=sc.nextFloat();
        float product= number1*number2;
        System.out.println("Product of 2 number is "+product);
    }
}
