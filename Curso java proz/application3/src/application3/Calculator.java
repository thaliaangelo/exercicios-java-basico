package application3;

public class Calculator {
    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}

Calculator calc = new Calculator();

System.out.print("Enter radius: ");
double radius = sc.nextDouble();

double c = calc.circumference(radius);

double v = calc.volume(radius);

System.out.printf("Circumference: %.2f%n", c);
System.out.printf("Volume: %.2f%n", v);
System.out.printf("PI value: %.2f%n", calc.PI);
