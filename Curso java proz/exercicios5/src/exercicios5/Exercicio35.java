package exercicios5;

import java.util.Scanner;

public class Exercicio35 {
    
        public static void main(String[] args){

            double No1, No2, Result;
            int escolha;
            String nome;
            Scanner teclado = new Scanner(System.in);

            System.out.println("Escolha a operação, \n 1 Brasil \n 2 Portugal \n 3 Japão \n 4 Nigéria");

            System.out.printf("escolha a operação");
            escolha = teclado.nextInt();

            System.out.println();

            switch(escolha){
            case 1:
            System.out.println("Você é sulamericano");
            break;

            case 2:
            System.out.println("Você é europeu");
            break;

            case 3:
            System.out.println("Você é Asiático");
            break;

            case 4:
            System.out.println("Você é Africano");
            break;

            default:
            System.out.println("Erro");
            break;
            }
        }
}
