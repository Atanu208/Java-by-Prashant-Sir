package task_6;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1=sc.nextInt();
        System.out.println(isPalindrome(number1));
    }
    public static boolean isPalindrome(int number)
    {
        int copyNum=number;

        int sum=0;
        while(copyNum>0)
        {
            int rem=copyNum%10;
            copyNum=copyNum/10;
            sum=(sum*10)+rem;
        }
        return number==sum ? true:false;
    }
}
