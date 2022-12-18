package exercicios5;

import java.util.Scanner;

public class Exercicio3 {

        public static void main(String[] args){

            String bebida;
            Scanner sc = new Scanner(System.in);

            System.out.printf("Escolha a bebida\n\nRefrigerante\nSuco\nÁgua\nLeite\n");
            System.out.println();
            System.out.printf("Escolha a bebida\n");
            bebida = sc.nextLine();

            System.out.println();
            System.out.println();
            if(bebida.equals("Refrigerante")) {
                System.out.println("Preço R$ 8,00 ");
            } else if (bebida.equals("Suco")){
                System.out.println("Preço R$ 6,00");
            } else if (bebida.equals("Agua")){
                System.out.println("Preço R$ 5,00");
            } else if (bebida.equals("Leite")){
                System.out.println("Preço R$ 4,00");
            } else {
                System.out.println("Erro");
            }
        }
}
