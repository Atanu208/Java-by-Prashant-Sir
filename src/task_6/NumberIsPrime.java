package task_6;

import java.util.Scanner;

public class NumberIsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1=sc.nextInt();
        System.out.println(numberIsPrime(number1));
    }
    public static boolean numberIsPrime(int number)
    {
        if(number == 0 || number < 0) return false;
        for(int i=2;i*i<= number;i++)
        {
            if(number%i== 0)
            {
                return false;
            }
        }
        return true;
    }
}
