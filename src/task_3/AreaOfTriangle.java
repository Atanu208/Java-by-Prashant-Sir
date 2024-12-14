package task_3;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base : ");
        float base=sc.nextFloat();
        System.out.println("Enter height : ");
        float height=sc.nextFloat();
        float area=(base* height)/2;
        System.out.println("Area of triangle is "+area);
    }
}
