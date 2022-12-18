package exercicios5;

import java.util.Scanner;

public class Exercicio42 {

        public static void main(String[] args){

            double preco, qtd, valorAPagar, dinheiroCliente, troco;
            String produto;

            Scanner teclado = new Scanner(System.in);

            System.out.printf("Informe o nome do produto ");
            produto = teclado.nextLine();

            System.out.printf("Informe o preço R$ ");   
            preco = teclado.nextDouble();

            System.out.printf("Informe a quantidade ");
            qtd = teclado.nextDouble();

            valorAPagar = preco * qtd;

            System.out.printf("\nSeu gasto foi de R$ " + valorAPagar);
            
            System.out.printf("\nValor Entregue pelo cliente R$ ");
            dinheiroCliente = teclado.nextDouble();

            troco = (dinheiroCliente - valorAPagar);

            System.out.printf("\nSeu troco é de R$ " + troco);
            System.out.printf("\nSeu troco é de R$ " + (dinheiroCliente - valorAPagar));
        }
}
