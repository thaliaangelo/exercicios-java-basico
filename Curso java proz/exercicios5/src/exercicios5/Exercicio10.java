package exercicios5;

import java.util.Scanner;

public class Exercicio10 {

        public static void main(String[] args){

            int ano;
            Scanner teclado = new Scanner(System.in);

            System.out.printf("");
            System.out.printf("\nDigite o seu ano de nascimento ");
            ano = teclado.nextInt();

            if((ano == 1980)||(ano == 1992)||(ano == 2004)||(ano == 2016)){ 
            System.out.println("Macaco");
            } else if((ano == 1981)||(ano == 1993)||(ano == 2005)||(ano == 2017)){
            System.out.println("Galo");
            }
        }
}
