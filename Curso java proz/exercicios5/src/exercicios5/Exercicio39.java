package exercicios5;

import java.util.Scanner;

public class Exercicio39 {

        public static void main(String[] args){

            double C, K, F, Re, Ra;
            Scanner teclado = new Scanner(System.in);
            int contador;
            
            for(contador = 0; contador < 3; contador++){
                System.out.printf("\nDigite a temperatura em graus ");
                C = teclado.nextDouble();

                F = C * 1.8 + 32;
                K = C + 273.15;
                Ra = C * 1.8 + 32 + 459.67;
                Re = C * 0.8;
                System.out.println("A temperatura em Fahrenheit é: " + F);
                System.out.println("A temperatura em Kelvin é: " + K);
                System.out.println("A temperatura em Reaumur é: " + Ra);
                System.out.println("A temperatura em Rankine é: " + Re);
            }
        }
}
