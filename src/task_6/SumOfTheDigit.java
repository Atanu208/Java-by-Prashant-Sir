package task_6;

import java.util.Scanner;

public class SumOfTheDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1=sc.nextInt();
        System.out.println(sumOfDigit(number1));
    }
    public static int sumOfDigit(int number)
    {
        int sum=0;
        while (number>0)
        {
            int rem= number%10;
            number= number/ 10;
            sum += rem;
        }
        return sum;
    }
}
