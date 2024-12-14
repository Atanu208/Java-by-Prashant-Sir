package task_4;

import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2=sc.nextInt();
        System.out.println("Enter your third number : ");
        int num3=sc.nextInt();
        if(num1 >= num2 && num1 >= num3) System.out.println(num1+" is greater");
        else if(num2 >= num3) System.out.println(num2 +" is grater");
        else System.out.println(num3+ " is greater");
    }
}
