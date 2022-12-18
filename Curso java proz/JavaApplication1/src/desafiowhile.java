import java.util.Scanner;
public class desafiowhile {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int numero, continuar = 1, somaImpares;
  somaImpares = 0;
  
  while(continuar == 1){
  System.out.print("Digite um número: ");
  numero = scan.nextInt();
  System.out.print("Digite 1 para continuar ou qualquer número para sair: ");
  continuar = scan.nextInt();
  if(numero %2 == 1){
  somaImpares = somaImpares + numero;
    }
  System.out.println("A soma dos números impares é: " + somaImpares);
    }
  }
}
