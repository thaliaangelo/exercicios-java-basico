package exercicios5;

import java.util.Scanner;

public class Exercicio34 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            int idade;
            double altura, peso;
            String nome;

            System.out.println("Digite o nome");
            nome = teclado.nextLine();

            System.out.println("Digite a idade");
            idade = teclado.nextInt();

            System.out.println("Digite o peso");
            peso = teclado.nextDouble();

            System.out.println("Digite a altura");
            altura = teclado.nextDouble();

            System.out.println(nome + ", " + idade + " anos, " + altura + " de altura e " + peso + " quilos ");
        }
}
