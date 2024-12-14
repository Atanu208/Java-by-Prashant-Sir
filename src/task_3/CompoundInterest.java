package task_3;

import java.util.Map;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p : ");
        float p=sc.nextFloat();
        System.out.println("Enter t : ");
        float t=sc.nextFloat();
        System.out.println("Enter r : ");
        float r=sc.nextFloat();
        double compoundInterest= Math.pow(p*(1+r/100),t);
        System.out.println("CompoundInterest "+compoundInterest);
    }
}
