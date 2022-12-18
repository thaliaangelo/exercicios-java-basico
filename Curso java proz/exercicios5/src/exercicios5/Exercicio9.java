package exercicios5;

import java.util.Scanner;

public class Exercicio9 {

        public static void main(String[] args){

            int ano;
            Scanner teclado = new Scanner(System.in);
            String [] HoroscopoChines = {"","Macaco","Galo","Cão","Porco","Rato","Boi","Tigre","Coelho","Dragão","Serpente","Cavalo","Cabra"};
            System.out.printf("\n1 - 1980, 1992, 2004, 2016 \n2 - 1981 1993, 2005, 2017\n3 - 1982, 1994, 2006, 2018\n4 - 1983, 1995, 2007, 2019\n5 - 1984, 1996, 2008, 2020\n6 - 1985, 1997, 2009, 2021\n7 - 1986, 1998, 2010\n8 - 1887, 1999, 2011\n9 - 1988, 2000, 2012\n10 - 1989, 2001, 2013\n11 - 1990, 2002, 2014\n12 - 1991, 2003, 2015 ");
            
            System.out.printf("");
            System.out.printf("\nDigite o número correspondente ao seu signo ");

            ano = teclado.nextInt();

            System.out.println("\nO seu signo no Horóscopo Chinês é " + HoroscopoChines[ano]);

            switch(ano) {   
            case 1:
            System.out.println("\nO seu signo no Horóscopo Chinês é Macaco");
            break;

            case 2:
            System.out.println("\nO seu signo no Horóscopo Chinês é Galo");
            break;

            case 3:
            System.out.println("\nO seu signo no Horóscopo Chinês é Cão");
            break;

            case 4:
            System.out.println("\nO seu signo no Horóscopo Chinês é Porco");
            break;

            case 5:
            System.out.println("\nO seu signo no Horóscopo Chinês é Rato");
            break;

            case 6:
            System.out.println("\nO seu signo no Horóscopo Chinês é Boi");
            break;

            case 7:
            System.out.println("\nO seu signo no Horóscopo Chinês é Tigre");
            break;

            case 8:
            System.out.println("\nO seu signo no Horóscopo Chinês é Coelho");
            break;

            case 9:
            System.out.println("\nO seu signo no Horóscopo Chinês é Dragão");
            break;

            case 10:
            System.out.println("\nO seu signo no Horóscopo Chinês é Serpente");
            break;

            case 11:
            System.out.println("\nO seu signo no Horóscopo Chinês é Cavalo");
            break;

            case 12:
            System.out.println("\nO seu signo no Horóscopo Chinês é Cabra");
            break;

            default:
            System.out.println("\nErro");
            break;
            }
            System.out.println("\nEstamos no Ano do Boi");
        }
}
