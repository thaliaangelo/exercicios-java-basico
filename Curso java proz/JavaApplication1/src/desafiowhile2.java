import java.util.Scanner;
public class desafiowhile2 {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int qtdenumeros;
  int loop = 0;
  int inserido = 0;
  int soma = 0;
  int contador = 1;

  System.out.println("Quantos números você quer inserir ? ");
  qtdenumeros = input.nextInt(); //Recebe a quantidade de números que serão inseridos

  //Executa o laço até chegar na quantidade definida pelo usuário
  while(loop != qtdenumeros){
  
  System.out.println("Digite o " + contador + "ºnúmero: ");
  inserido = input.nextInt();

  //Separa os números impares e adiciona na soma
    if(inserido %2 != 0){
       soma = (soma + inserido);
      }
  contador = contador + 1; //Incrementa o contador
  loop++;  //Incrementa o laço até chegar na quantidade definida pelo usuário
    }
  System.out.println("A soma dos números impares é: " + soma);
  }
}
