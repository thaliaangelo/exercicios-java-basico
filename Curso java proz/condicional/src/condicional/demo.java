package condicional;
import java.util.Scanner;

public class demo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o preço");
        double price = sc.nextDouble();

        if (price > 100.0){
            double discount = price * 0.1;
            System.out.println("Desconto: " + discount);
        }
    }
}
