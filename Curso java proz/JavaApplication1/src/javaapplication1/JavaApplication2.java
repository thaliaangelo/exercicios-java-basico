package javaapplication1;

import java.util.Scanner;
public class JavaApplication2 
{
    public static void main(String[] args) 
     {
       // Declare o objeto da classe Scanner (sc)
        Scanner sc = new Scanner (System.in);
        // Entrada de uma String
        String nome = sc.nextLine();
        //Entrada de um Caracter
        char genero = sc.next() .charAt(0);
        //Entrada de um número byte, short ou float
        int idade = sc.nextInt();
        long fone = sc.nextLong();
        double cod = sc.nextDouble();
        
        // Imprimindo os valores para checar as entradas:
        System.out.println("Nome: " +nome);
        System.out.println("Gênero: " +genero);
        System.out.println("Idade: " +idade);
        System.out.println("Número do celular: " +fone);
        System.out.println("COD: " +cod );
    }
    
}
