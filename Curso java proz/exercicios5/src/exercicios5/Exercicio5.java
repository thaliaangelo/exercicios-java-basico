package exercicios5;

import java.util.*;

public class Exercicio5 {

        public static void main(String[] args){

            float qtd, meta;
            float preco;
            String Nome;
            int contador = 0;
            Scanner sc = new Scanner(System.in);
                System.out.printf("\nInforme a qtd de produtos\n");
                meta = sc.nextFloat();

                while(contador <= meta){
                    sc.nextLine();
                    System.out.print("\nDigite o nome do produto\n");
                    Nome = sc.nextLine();

                    System.out.print("Digite o preço\nR$ ");
                    preco = sc.nextFloat();

                    System.out.print("Digite a quantidade\n");
                    qtd = sc.nextFloat();

                    System.out.print("\n" + Nome + " - " + preco + " - " + qtd);
                    contador++;
                }
        }
}
