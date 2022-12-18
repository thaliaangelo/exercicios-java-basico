package exercicios5;

import java.util.Scanner;

public class Exercicio15 {

        public static void main(String[] args){ 

            double No1, No2, subt, metade, metade2, potencia;

            Scanner teclado = new Scanner(System.in);

            System.out.printf("Informe o primeiro número \n");
            No1 = teclado.nextDouble();

            System.out.printf("Informe o segundo número \n");
            No2 = teclado.nextDouble();

            subt = (No1 - No2);
            metade = (No1 / 2);
            metade2 = (No2 / 2);
            potencia = (No1 * No1);

            System.out.println();

            System.out.println("\nO primeiro número menos o segundo número é " + subt);
            System.out.println("\nA metade do primeiro número é " + metade);
            System.out.println("\nA metade do segundo número é " + metade2);
            System.out.println("\nA potencia do primeiro número é " + potencia);
            System.out.println("\nA potencia do segundo número é " + Math.pow(No2,2));
        }
}
