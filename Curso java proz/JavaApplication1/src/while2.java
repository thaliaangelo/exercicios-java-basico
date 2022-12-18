import java.util.Scanner;
public class while2 {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int numero, op = 1;
  while (op == 1) {
  System.out.print("Digite um número: ");
  numero = scan.nextInt();
  System.out.print("Digite 1 para continuar ou qualquer número para sair: ");
  op = scan.nextInt();
    }
  }
}
