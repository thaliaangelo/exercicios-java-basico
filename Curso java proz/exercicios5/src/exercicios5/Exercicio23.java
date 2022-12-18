package exercicios5;

import java.util.Scanner;

public class Exercicio23 {

        public static void main(String[] args){
        
            int contador = 0;
            int result;
            int numero;
            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite a tabuada\n");
            numero = teclado.nextInt();

            while (contador <= 10){
                result = numero * contador;
                System.out.println("\n" + numero + " x " + contador + " = " + result);
                contador = contador + 1;
            }
            System.out.println("\nParabéns");
        }
}
