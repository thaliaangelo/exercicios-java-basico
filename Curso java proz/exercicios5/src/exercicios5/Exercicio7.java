package exercicios5;

import java.util.Scanner;

public class Exercicio7 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            int escolha, contador;

            System.out.println(" \n 1 Sandra \n 2 Marcia \n 3 Paulo "); 
            System.out.print(" \n Escolha o Gerente ");
            escolha = teclado.nextInt();

            switch(escolha) {
            case 1:
            System.out.println("\nSandra - 06 às 14 - cel 11 92222-2222");
            break;

            case 2:
            System.out.println("\nMarcia - 14 às 22 - cel 11 93333-3333");
            break;

            case 3:
            System.out.println("\nPaulo - 22 às 06 - cel 11 94444-4444");
            break;

            default:
            System.out.println("\nErro");
            break;
            }

            System.out.println("\nVolte Sempre");
        }
}
