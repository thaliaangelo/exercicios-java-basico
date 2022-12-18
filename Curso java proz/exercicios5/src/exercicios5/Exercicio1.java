package exercicios5;

import java.util.Scanner;

public class Exercicio1 {

        public static void main(String[] args){
            double N1, N2, resultado;
            int escolha;
            Scanner sc = new Scanner(System.in);

            System.out.printf("Informe o primero número\n");
            N1 = sc.nextDouble();

            System.out.printf("Informe o segundo número\n");
            N2 = sc.nextDouble();

            System.out.println("Escolha a operação, \n 1 soma \n 2 subtração \n 3 divisão \n 4 multiplicação");
            escolha = sc.nextInt();

            switch(escolha){
            case 1: resultado = N1 + N2;
            System.out.println("A soma é " + resultado);
            break;
            case 2: resultado = N1 - N2;
            System.out.println("A subtração é " + resultado);
            break;
            case 3: resultado = N1 / N2;
            System.out.println("A divisão é " + resultado);
            break;
            case 4: resultado = N1 * N2;
            System.out.println("A multiplicação é " + resultado);
            break;
            default: System.out.println("Erro");
            }
        }
}
