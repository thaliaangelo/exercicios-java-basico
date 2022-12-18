package condicional;

public class bhaskara {
    public static void main(String[] args){
        int a = -1 , b = 2 , c = 3;
        double delta, x1, x2;
        delta = Math.pow(b, 2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Valor de x1: " + x1);
        System.out.println("Valor de x2: " + x2);
    }
}
