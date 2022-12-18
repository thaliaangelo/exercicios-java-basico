package exercicios5;

import java.util.Scanner;

public class Exercicio32 {

        public static void main(String[] args){

            double preco;
            double qtd;
            double total;
            double totalPagar = 0;
            int contador = 0;

            for (contador = 0; contador <= 3; contador++) {
                String produto;
                Scanner teclado = new Scanner(System.in);

                System.out.printf("\nDigite o nome do produto ");
                produto = teclado.nextLine();

                System.out.printf("Quantidade comprada ");  
                qtd = teclado.nextDouble();

                System.out.printf("Preço do produto ");
                preco = teclado.nextDouble();

                total = qtd * preco;

                System.out.println("\n" + produto + " Total a pagar " + total);
                totalPagar = totalPagar + total;
            }
            System.out.println(" \n Total à pagar " + totalPagar);
        }
}
