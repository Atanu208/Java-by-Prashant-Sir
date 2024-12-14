package task_4;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks=sc.nextInt();
        if(marks >=90) System.out.println("A++");
        else if(marks>= 75 && marks<90) System.out.println("A");
        else if (marks>=50 && marks<75) System.out.println("B");
        else if (marks>=25 && marks<50) System.out.println("C");
        else System.out.println("F");
    }
}
