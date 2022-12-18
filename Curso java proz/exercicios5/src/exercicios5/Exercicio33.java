package exercicios5;

import java.util.Scanner;

public class Exercicio33 {

        public static void main(String[] args){

            String fruta;
            double preco;
            double qtd;
            double tpagar;
            int escolha;

            Scanner teclado = new Scanner(System.in);

            System.out.println("À vista desconto 5%, acima de R$ 50, 10%. \nPrazo Juros 5%. \nCartão preço normal\n");
            System.out.println("Forma de pagameto\n1 à vista \n2 Prazo \n3 Cartão \n");

            System.out.printf("Digite o nome da fruta\n");
            fruta = teclado.nextLine();

            System.out.printf("Digite a quantidade\n");
            qtd = teclado.nextDouble();

            System.out.printf("Digite o preço\n");
            preco = teclado.nextDouble();

            tpagar = preco * qtd;

            System.out.println("Digite o número da forma de pagamento");
            escolha = teclado.nextInt();

            switch(escolha) {
                case 1:
                if (tpagar > 50) {
                    tpagar = tpagar-(tpagar/100*10);
                } else {
                    tpagar = tpagar-(tpagar /100*5);
                }
                System.out.println("\nTotal a pagar R$ " + tpagar);
                break;

                case 2:
                tpagar = tpagar + (tpagar/100*5);
                System.out.println("\nTotal a pagar R$" + tpagar);
                break;

                case 3:
                System.out.println("\n Total a pagar R$ " + tpagar);
                break;

                default:
                System.out.println("\n Erro");
                break;
            }
            System.out.println("\nVolte sempre");
        }
}
