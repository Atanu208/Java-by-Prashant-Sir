package task_6;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1=sc.nextInt();
        System.out.println("Enter your second number : ");
        int number2=sc.nextInt();
        System.out.println(lcm(number1,number2));
    }
    public static int lcm(int number1,int number2)
    {
        int lcm=0;
        for (int i = 1; i <number2 ; i++) {
            if((number1*i)%number2==0) return lcm=number1*i;
        }
        return lcm;
    }
}
