package exercicios5;

import java.util.Scanner;

public class Exercicio8 {

        public static void main(String[] args){

            double velocidade, tempo, espaco, resultado;
            int escolha;
            String nome;    
            Scanner teclado = new Scanner(System.in);

            System.out.println("Escolha a operação, \n 1 velocidade \n 2 tempo \n 3 espaço");
            escolha = teclado.nextInt();

            switch(escolha) {
            case 1:
            System.out.println("cálculo da velocidade");
            System.out.printf("\nInforme o espaço inicial\n");
            espaco = teclado.nextDouble();

            System.out.printf("Informe o tempo\n");
            tempo = teclado.nextDouble();

            resultado = espaco / tempo;
            System.out.println("O resultado " + resultado + "km/h");
            break;

            case 2:
            System.out.print("cálculo do tempo");
            System.out.printf("\nInforme o espaço inicial\n");
            espaco = teclado.nextDouble();

            System.out.printf("Informe a velocidade\n");
            velocidade = teclado.nextDouble();

            resultado = espaco / velocidade;
            System.out.println("Tempo foi de " + resultado + "h");
            break;

            case 3:
            System.out.print("cálculo do espaço percorrido");
            System.out.printf("\nInforme o tempo\n");
            tempo = teclado.nextDouble();

            System.out.printf("Informe a velocidade\n");
            velocidade = teclado.nextDouble();

            resultado = velocidade * tempo;
            System.out.println("O espaço é " + resultado + "Km");
            break;
            
            default:
            System.out.println("Erro");
            }
        }
}
