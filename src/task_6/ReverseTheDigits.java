package task_6;

import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1=sc.nextInt();
        System.out.println(reverseTheDigits(number1));
    }
    public static int reverseTheDigits(int number)
    {
        int copyNum=number;
        int sum=0;
        if(copyNum<0) copyNum=copyNum * (-1);

        while(copyNum>0)
        {
            int rem=copyNum%10;
            copyNum = copyNum/10;
            sum = sum *10+rem;
        }
        return number<0 ? sum * (-1) : sum;
    }
}
