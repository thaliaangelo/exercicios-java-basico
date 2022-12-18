import java.io.*;
import java.util.*;
public class Teste 
{
    public static void main (String[] args)
    {
        String s = "CursodeJAVA";
        // ou String s = new String ("CursodeJava");
        //Retorna o número de caracteres na String
        System.out.println("Tamanho da String = " + s.length ());
        //Returns the character at ith index.
        System.out.println("Caracter na 3º posição = " + s.charAt(3) );
        //Retorna a substring no índice 3
        System.out.println("Substring = " + s.substring(3));
        //Retorna a substring do índice i até j-1 (2 a 5)
        System.out.println("Substring = " + s.substring(2, 5));
        //Concatena a string2 no fim da string1.
        String s1 = "JAVA";
        String s2 = "Cursode";
        System.out.println("String concatenada = " + s1.concat(s2));
        //Retorna o índice da ocorrência da palavra indicada
        String s4 = "Learn Share Learn";
        System.out.println("Índice da palavra Share = " + s4.indexOf("Share"));
        //Retorna o índice da letra a em sua primeira ocorrencia
        System.out.println("Índice de a = " + s4.indexOf('a',3));
        //checando a igualdade das Strings
        Boolean out = "JAVA".equals("java");
        System.out.println("Checando igualdade " + out);
        out = "JAVA".equals("JAVA");
        System.out.println("Checando igualdade " + out);
        out = "JAVA".equalsIgnoreCase("JAva");
        System.out.println("Checando igualdade " + out);
        //Comparando 2 Strings
        int out1 = s1.compareTo(s2);
        System.out.println("A diferença na tabela ASCII vale = " + out1);
        //Convertendo maiúsculas e minúsculas
        String word1 = "JaVa";
        System.out.println("Minúsculas: " + word1.toLowerCase ());
        //Convertendo maiúsculas e minúsculas
        String word2 = "JaVa";
        System.out.println("Maiúsculas: " + word2.toUpperCase ());
        //Trocando caracteres
        String str1 = "CursodeJBVB";
        System.out.println("String Original " + str1);
        String str2 = "CursodeJBVB ".replace('B','A');
        System.out.println("Trocando A por B -> " + str2);
        
    }
}
