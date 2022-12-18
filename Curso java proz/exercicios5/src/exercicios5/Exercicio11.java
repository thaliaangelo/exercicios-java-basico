package exercicios5;

import java.util.Scanner;

public class Exercicio11 {

        public static void main(String[] args){

            double minutosf;
            double tfabricar;
            Scanner teclado = new Scanner(System.in);

            System.out.printf("\nMinutos para terminar o expediente.");
            minutosf = teclado.nextDouble();

            System.out.printf("\nTempo de fabricação de um ovo.");
            tfabricar = teclado.nextDouble();

            if((2*tfabricar) <= minutosf){
            System.out.printf("\nFarei hoje! ");
            } else {
            System.out.printf("\n Deixa para amanhã! ");
            }        
        }
}
