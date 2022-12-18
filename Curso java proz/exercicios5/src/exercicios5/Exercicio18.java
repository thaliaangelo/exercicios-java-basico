package exercicios5;

import java.util.Scanner;

public class Exercicio18 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            double escolha, total;

            System.out.println(" \nA) Compras acima de R$ 1000 desconto de 10% e frete grátis.\nB) Compras de R$ 500 à 1000,00. 10% de desconto.\nC) Compras de R$ 200 à 499,99 cupom de desconto de 10% na próxima compra. ");
            
            System.out.print(" \n Digite o Total R$ ");
            total = teclado.nextDouble();

            if (total > 100) {
                System.out.println(" \n Desconto de 10% e frete grátis");
            } else if (total >= 500) {
                System.out.println(" \n Desconto de 10%");
            } else if (total >= 200) {
                System.out.println(" \n Cupom de desconto de 10% na próxima compra");
            } else {
                System.out.println("Valor normal");
            }
            System.out.println("\n\nVolte Sempre");
        }
}
