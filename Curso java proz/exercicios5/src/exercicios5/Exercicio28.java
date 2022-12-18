package exercicios5;

import java.util.Scanner;

public class Exercicio28 {

        public static void main(String[] args){

            double No1, No2, Result;
            int escolha;
            String nome;
            Scanner teclado = new Scanner(System.in);

            System.out.println("Escolha a operação, \n 1 soma \n 2 subtração \n 3 Divisão \n 4 Multiplicação");

            System.out.printf("escolha a operação");
            escolha = teclado.nextInt();

            System.out.println();

            if (escolha == 1) {
                System.out.printf("Informe o No 1\n");
                No1 = teclado.nextDouble();

                System.out.printf("Informe o No 2\n");
                No2 = teclado.nextDouble();

                Result = No1 + No2;
                System.out.println("Resultado é " + Result);

            } else if (escolha == 2) {
                System.out.printf("Informe o No 1\n");
                No1 = teclado.nextDouble();

                System.out.printf("Informe o No 2\n");
                No2 = teclado.nextDouble();

                Result = No1 - No2;
                System.out.println("Resultado é " + Result);

            } else if (escolha == 3) {
                System.out.printf("Informe o No 1\n");
                No1 = teclado.nextDouble();

                System.out.printf("Informe o No 2\n");
                No2 = teclado.nextDouble();

                Result = No1 / No2;
                System.out.println("Resultado é " + Result);

            } else {
                System.out.printf("Informe o No 1\n");
                No1 = teclado.nextDouble();
                
                System.out.printf("Informe o No 2\n");
                No2 = teclado.nextDouble();

                Result = No1 * No2;
                System.out.println("Resultado é " + Result);
            }
        }
}
