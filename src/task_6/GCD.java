package task_6;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1=sc.nextInt();
        System.out.println("Enter your second number : ");
        int number2=sc.nextInt();
        System.out.println(gcd(number1,number2));
    }
    public static int gcd(int num1,int num2)
    {
        int top=0;
        if(num1==0) top =num2;
        if(num2==0) top =num1;

        int min= num1>num2?num2 : num1;

        for (int i = 1; i <min ; i++) {
            if(num1%i==0 && num2%i==0) top=i;
        }
        return top;
    }
}
