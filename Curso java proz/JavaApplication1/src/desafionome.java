import java.util.Scanner;
public class desafionome {
    public static void main(String args []){
        System.out.println("Escreva seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Todas as letras minúsculas: " +nome.toLowerCase());
        System.out.println("Todas as letras maiúsculas: " +nome.toUpperCase());
        
    }
}
