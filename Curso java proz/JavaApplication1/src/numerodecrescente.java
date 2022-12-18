import java.util.Scanner;
public class numerodecrescente {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Digite um número: ");
        x = scan.nextInt();
        System.out.println("Digite um número diferente do primeiro: ");
        y = scan.nextInt();
        if(x > y){
            System.out.println("A ordem decrescente é: " +x+ "," +y);
        }else{
            System.out.println("A ordem decrescente é: " +y+ ","  +x);
        }
    }
}
