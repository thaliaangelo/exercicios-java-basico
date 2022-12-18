package exercicios5;

import java.util.Scanner;

public class Exercicio31 {

        public static void main(String[] args){

            double preco;
            double qtd;
            double total;
            double totalPagar = 0;
            int contador = 0;

            while (contador <= 6){
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
                
                contador = contador + 1;

                totalPagar = totalPagar + total;
            }
            System.out.println(" \n Total à pagar " + totalPagar);
        }
}
