package exercicios5;

import java.util.Scanner;

public class Exercicio20 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            int idade;
            String nome;
            int ano = 365;

            System.out.printf("Digite o nome");
            nome = teclado.nextLine();

            System.out.printf("Digite a idade");
            idade = teclado.nextInt();

            System.out.println("Você viveu " + (idade * ano));
        }
}
