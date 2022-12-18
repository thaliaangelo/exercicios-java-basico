package revisao04;

public class revisao {
    public static void main(String[] args){
        //Escrever um texto qualquer na tela:
        //Sem quebra de linha ao final:
        System.out.print("Bom dia!");
        
        //Com quebra de linha ao final:
        System.out.println("Bom dia!");

        //Escrever o conteúdo de uma variável tipo básica:
        int y = 32;
        System.out.println(y);

        //Escrever o conteúdo de uma variável com ponto flutuante:
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        //Concatenar vários elementos em um mesmo comando de escrita:
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
