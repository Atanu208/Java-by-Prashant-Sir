package task_3;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Fahrenheit : ");
        float fahrenheit =sc.nextFloat();
        float celsius = (fahrenheit-32)/1.8f;
        System.out.println("Celsious : "+celsius);
    }
}
