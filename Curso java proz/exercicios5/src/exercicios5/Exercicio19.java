package exercicios5;

import java.util.Scanner;

public class Exercicio19 {

        public static void main(String[] args){

            double preco, unidades, valorAPagar;
            String produto;
            Scanner teclado = new Scanner(System.in);

            System.out.printf("Informe a quantidade");
            unidades  = teclado.nextDouble();

            if (unidades > 10) {
                System.out.printf("\nSeu desconto é de 10 porcento.");
            } else if (unidades >= 5) {
                System.out.printf("\nSeu desconto é de 5 porcento.");
            } else {
                System.out.printf("\nSeu desconto é de 0.");
            }
            System.out.printf("\nVolte Sempre!!!");
        }
}
