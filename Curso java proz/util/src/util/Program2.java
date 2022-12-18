package util;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator3;

public class Program2 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator3.circumference(radius);

       double v = Calculator3.volume(radius);

       System.out.printf("Circumference: %.2f%n", c);
       System.out.printf("Volume: %.2f%n", v);
       System.out.printf("PI Value: %.2f%n", Calculator3.PI);
    }
}
