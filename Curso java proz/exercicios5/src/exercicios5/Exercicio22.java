package exercicios5;

import java.util.Scanner;

public class Exercicio22 {

        public static void main(String[] args){
            int meta;
            int numero;
            int par = 0;
            int impar = 0;

            Scanner teclado = new Scanner(System.in);

            System.out.printf("\nInforme a qtd de números\n");
            meta = teclado.nextInt();

            for (int contador = 1; contador <= meta; contador = contador + 1){
                teclado.nextLine();
                
                System.out.print("Digite o número\n");
                numero = teclado.nextInt();

                if(numero % 2 == 1){
                    impar = impar + numero;
                } else {
                    par = par + numero;
                }
            }
            System.out.print("\nSoma dos números par " + par);
            System.out.print("\nSoma dos números impares " + impar);
        }
}
