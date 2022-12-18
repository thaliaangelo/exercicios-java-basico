package exercicios5;

import java.util.Scanner;

public class Exercicio14 {

        public static void main(String[] args){

            double gravidadeTerra = 9.8;
            double massa;
            double peso;
                
            Scanner teclado = new Scanner(System.in);

            System.out.printf("Digite sua massa ");
            massa = teclado.nextDouble();

            peso = massa * gravidadeTerra;

            System.out.println("A força que a Terra faz para te deixar no solo é de " + peso + " Newton");
        }
}
