package task_6;

import java.util.Scanner;

public class CalculatesTheFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        long number=sc.nextLong();
        System.out.println(calculatesTheFactorial(number));
    }
    public static long calculatesTheFactorial(long number)
    {
        if(number == 0) return 1;
        long sum=1;
        for (long i = number; i>0 ; i--) {
            sum= sum*i;
        }
        return sum;
    }
}
