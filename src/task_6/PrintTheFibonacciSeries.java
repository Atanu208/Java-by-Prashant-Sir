package task_6;
import java.util.Scanner;

public class PrintTheFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number1=sc.nextInt();
        printTheFibonacciSeries(number1);
    }
    public static void printTheFibonacciSeries(int number)
    {
        int a=0;
        int b=1;
        for (int i = 0; i <number ; i++) {
            System.out.println(a);
            int temp = a;
            a=temp+b;
            b=temp;
        }
    }

}
