package exercicios5;

import java.util.Scanner;

public class Exercicio37 {

        public static void main(String[] args){

            int Numero;
            int contador = 0;
            int resultado;
            Scanner teclado = new Scanner(System.in);

            System.out.printf("Digite o número \n");
            Numero = teclado.nextInt();

            while (contador <= 100){
                resultado = Numero * contador;
                System.out.printf("\n" + Numero + " x " + contador + " = " + resultado);
                contador = contador + 1;
            }
        }
}
