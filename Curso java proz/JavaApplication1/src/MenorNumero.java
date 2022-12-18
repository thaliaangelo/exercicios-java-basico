import java.util.Scanner;
public class MenorNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Digite um número: ");
        x = scan.nextInt();
        System.out.println("Digite um número diferente do primeiro: ");
        y = scan.nextInt();
        if(x < y){
            System.out.println("O número " +x+ " é o menor");
        }else{
            System.out.println("O número " +y+ " é o menor");
        }
    }
}
