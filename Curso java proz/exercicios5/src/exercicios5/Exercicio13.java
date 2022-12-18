package exercicios5;

import java.util.Scanner;

public class Exercicio13 {

        public static void main(String[] args){

            double pi = 3.14;
            double perimetro;
            double diametro;
            Scanner teclado = new Scanner(System.in);

            System.out.printf("digite o diametro ");
            diametro = teclado.nextDouble();

            perimetro = diametro * pi;

            System.out.println(" O perimetro é " + perimetro);
        }
}
