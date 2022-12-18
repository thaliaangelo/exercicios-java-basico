package exercicios5;

import java.util.Scanner;

public class exercicio36 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            int salario;
            int salarioMinimo;
            int qtd;
            String nome;

            System.out.printf("Digite Nome");   
            nome = teclado.nextLine();

            System.out.printf("Digite o salário ");
            salario = teclado.nextInt();

            System.out.printf("Digite o salário mínimo ");
            salarioMinimo = teclado.nextInt();

            qtd = salario / salarioMinimo;

            System.out.println("Quantos salários minímo recebe " + qtd);
        }
}
