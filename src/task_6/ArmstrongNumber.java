package task_6;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1=sc.nextInt();
        System.out.println(isArmstrongNumber(number1));
    }
    public static boolean isArmstrongNumber(int number)
    {
        int copyNum1=number;
        int copyNum2=number;
        int count=0;
        int sum=0;

        while(copyNum1>0)
        {
            copyNum1 = copyNum1/10;
            count++;
        }
        while (copyNum2>0)
        {
            int rem=copyNum2%10;
            sum +=Math.pow(rem,count);
            copyNum2 = copyNum2/10;
        }
        if(sum == number) return true;

        return false;
    }
}
