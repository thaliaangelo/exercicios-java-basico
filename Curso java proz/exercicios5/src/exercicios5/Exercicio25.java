package exercicios5;

import java.util.Scanner;

public class Exercicio25 {


    public static void main(String[] args){
            
            Scanner teclado = new Scanner(System.in);
        
            double n1, n2, subt, div, mult, soma;
            
            System.out.println("Informe um número 1");
            n1 = teclado.nextDouble();

            System.out.println("Informe um número 2");
            n2 = teclado.nextDouble();

            soma = n1 + n2;
            mult = n1 * n2;
            div = n1 / n2;
            subt = n1 - n2;

            System.out.println("A subtração é de " + subt);
            System.out.println("A soma é de " + soma);
            System.out.println("A multiplicação é de " + mult);
            System.out.println("A divisão é de " + div);
    }
}
