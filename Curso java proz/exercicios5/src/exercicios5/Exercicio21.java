package exercicios5;

import java.util.Scanner;

public class Exercicio21 {

        public static void main(String[] args){

            int meta;
            int numero;
            int par = 0;
            int contador = 0;
            int impar = 0;

            Scanner teclado = new Scanner(System.in);

            System.out.printf("\nInforme a qtd de Números\n");
            meta = teclado.nextInt();

            do {
            teclado.nextLine();
            System.out.print("Digite o número\n ");
            numero = teclado.nextInt();

            if (numero % 2 == 1){
                impar = impar + numero;
            } else {
                par = par + numero;
            }
            contador = contador + 1;
            }
            while (contador < meta);

            System.out.print("\nSoma dos números par " + par);
            System.out.print("\nSoma dos números impares " + impar);
        }
}
