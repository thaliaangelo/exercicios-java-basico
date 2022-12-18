package exercicios5;

import java.util.Scanner;

public class Exercicio2 {

        public static void main(String[] args){
        
            Scanner sc = new Scanner(System.in);
            int escolha;
            String [] atletas = {"Maria Esther Bueno","Éder Jofre","Ayrton Senna","Rivelino","Adhemar Ferreira da Silva","Hortência","Maria Lenk"};
            
            System.out.printf("\n\nDigite o número do atleta\n");
            escolha = sc.nextInt();

            System.out.println("\n" + atletas[escolha]);

            System.out.println("\n\nFIM");
        }
}
