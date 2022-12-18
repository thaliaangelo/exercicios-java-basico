package exercicios5;

import java.util.Scanner;

public class Exercicio6 {

        public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            int escolha;

            System.out.printf("\n1 - Maria Esther Bueno\n2 - Éder Jofre\n3 - Ayrton Senna\n4 - Rivelino\n5 - Adhemar Ferreira da Silva\n6 - Hortência\n7 - Maria Lenk");
            System.out.printf("\nEscolha a opção ");
            escolha = teclado.nextInt();

            switch(escolha) {
            case 1:
            System.out.println("Tênis");
            break;

            case 2:
            System.out.println("\nBoxe 2 vezes campeão do mundo");
            break;

            case 3:
            System.out.println("Automobilismo, 3 vezes campeão do mundo");
            break;

            case 4:
            System.out.println("Futebol 1 vez campeão do mundo");
            break;

            case 5:
            System.out.println("Atletismo 2 vezes campeão do mundo");
            break;

            case 6:
            System.out.println("Basquete 1 vez campeã do mundo");
            break;

            case 7:
            System.out.println("Natação");
            break;

            default:
            System.out.println("Número Incorreto");
            break;
            }
            System.out.println("\nFIM");
        }

}
