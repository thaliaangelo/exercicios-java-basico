package exercicios5;

import java.util.Scanner;

public class Exercicio12 {

        public static void main(String[] args){

            int diasDeAula = 200;
            int presenca;
            int falta;
            Scanner teclado = new Scanner(System.in);

            System.out.printf("Quantas presenças o aluno teve ?");
            presenca = teclado.nextInt();

            falta = diasDeAula - presenca;

            System.out.println("O aluno teve " + falta + " faltas.");
        }
}
