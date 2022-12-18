package conversorMonetario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMonetario {
    
    public double calculaValor(double reais, double taxa) {
        double total;
            total = reais/taxa;
            return total;
    }
    
    public static void main(String[] args) {
        
// objeto teclado para ler os valores
        Scanner teclado = new Scanner(System.in);

//instancia a classe criada em um objeto c
        ConversorMonetario c = new ConversorMonetario();

//cria as variáveis
        double reais;
        double taxa = 0;
        int codigoMoeda;
//boa prática de programação, sempre defina as variáveis no início

        System.out.println("Qual o valor em reais? ");

//escreve na tela a pergunta
        reais = teclado.nextDouble();
        System.out.println("Qual o código da moeda ? 1 = euro, 2 = dólar ");

//lê a resposta
        codigoMoeda = teclado.nextInt();

//se o código for 1, a taxa será do euro, senão se for 2 será dólar
        if (codigoMoeda == 1){
            System.out.println("Qual o valor do euro? ");
            taxa = teclado.nextDouble();
        } else if (codigoMoeda == 2) {
            System.out.println("Qual o valor do dólar? ");
            taxa = teclado.nextDouble();
          }
//verifica se o valor não é zero
        if ((reais == 0) || (taxa == 0)){
            System.out.println("Valor inváldo! Valor diferente de zero !!!");
        } else {      
            System.out.print("Valor convertido = $");

//formatação da saida dos dados com 2 casas decimais, já chamando o método
            System.out.println(new DecimalFormat("#,##0.00").format(c.calculaValor(reais,taxa)));
            }
    }

}
