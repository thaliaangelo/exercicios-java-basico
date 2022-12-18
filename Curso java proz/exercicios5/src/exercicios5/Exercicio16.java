package exercicios5;

import java.util.Scanner;

public class Exercicio16 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);

            int No1, No2, meta;
            int contador = 1;
            int soma = 0;

            System.out.printf("Informe a qtd de números\n");
            meta = teclado.nextInt();

            while(contador <= meta) {
            System.out.printf("Digite o número\n");
            No1 = teclado.nextInt();

            if ((No1 % 2) == 1) {
            soma = soma + No1;
            contador = contador + 1;
            }
            System.out.println("O resultado é " + soma);
            }
        }
}
