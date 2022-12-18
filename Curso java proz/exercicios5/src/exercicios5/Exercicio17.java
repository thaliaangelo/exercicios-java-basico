package exercicios5;

import java.util.Scanner;

public class Exercicio17 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            int No1, No2, meta, soma, contador;

            System.out.printf("Informe a qtd de números\n");
            meta = teclado.nextInt();

            No2 = 2;
            soma = 0;

            for (contador = 1; contador <= meta; contador = contador + 1) {
                System.out.printf("Digite o número\n");
                No1 = teclado.nextInt();

                if ((No1 % No2) == 1){
                    soma = soma + No1;
                }
                System.out.println("O resultado é " + soma);
            }
        }
}
