package task_6;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line you want to print: ");
        int numberOfLine=sc.nextInt();
        rightHalfPyramid(numberOfLine);
        System.out.println();
        reverseRightHalfPyramid(numberOfLine);
        System.out.println();
        leftHalfPyramid(numberOfLine);
    }
    public static void rightHalfPyramid(int numberOfLine)
    {
        for (int i = 1; i <= numberOfLine ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void reverseRightHalfPyramid(int numberOfLine)
    {
        for (int i = numberOfLine; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void leftHalfPyramid(int numberOfLine)
    {
        int space=numberOfLine-1;
        int star=1;

        for (int i = 1; i<=numberOfLine ; i++) {
            for (int j = 1; j <= space ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star ; j++) {
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
