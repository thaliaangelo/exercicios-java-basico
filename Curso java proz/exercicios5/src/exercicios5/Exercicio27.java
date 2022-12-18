package exercicios5;

import java.util.Scanner;

public class Exercicio27 {

        public static void main(String[] args){
            int idade;  
            String nome;

            Scanner teclado = new Scanner(System.in);

            System.out.printf("Seu nome\n");
            nome = teclado.nextLine();

            System.out.println();

            System.out.printf("Digite sua idade\n");
            idade = teclado.nextInt();

            System.out.println();

            if (idade >= 18){
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
}
