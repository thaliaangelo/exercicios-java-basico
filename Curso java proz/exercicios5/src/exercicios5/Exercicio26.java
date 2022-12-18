package exercicios5;

import java.util.Scanner;

public class Exercicio26 {

        public static void main(String[] args){

            double Nota1, Nota2, Nota3, Nota4, Media;
            String nome;

            Scanner teclado = new Scanner(System.in);

            System.out.printf("Seu nome\n");
            nome = teclado.nextLine();

            System.out.println();

            System.out.printf("Informe uma nota 1\n");
            Nota1 = teclado.nextDouble();

            System.out.printf("Informe uma nota 2\n");
            Nota2 = teclado.nextDouble();

            System.out.printf("Informe uma nota 3\n");
            Nota3 = teclado.nextDouble();

            System.out.printf("Informe uma nota 4\n");
            Nota4 = teclado.nextDouble();

            Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
            System.out.println();

            if (Media > 10) {
                System.out.println("Valor da nota incorreta");
            } else if (Media >= 6) {
                System.out.println(nome + " \n A Média é de " + Media + " \nVocê foi aprovado");
            } else {
                System.out.println(nome + " \n A Média é de " + Media + " \n Você foi reprovado");
            }
        }
}
