import java.util.Scanner;
public class Maiorque20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = scan.nextInt();
        if(num >= 20){
            System.out.println("O número " +num+ " é maior que 20");
        } else {
           System.out.println("O número " +num+ " é menor que 20");
        }
    }
}
