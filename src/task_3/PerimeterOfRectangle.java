package task_3;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length : ");
        float length=sc.nextFloat();
        System.out.println("Enter width : ");
        float width=sc.nextFloat();

        float perimeterOfRectangle= 2 *(length+width);
        System.out.println("Perimeter of rectangle : "+perimeterOfRectangle);
    }
}
