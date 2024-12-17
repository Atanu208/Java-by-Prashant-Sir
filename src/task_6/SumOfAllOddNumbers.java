package task_6;

import java.util.Scanner;

public class SumOfAllOddNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number=sc.nextInt();
        System.out.println(sumOfAllOddNumber(number));
    }
    public static int sumOfAllOddNumber(int number)

    {
        int sum=0;
        for(int i=1; i<=number;i +=2)
        {
            sum +=i;
        }
        return sum;
    }
}
