package exercicios5;

import java.util.Scanner;

public class Exercicio30 {

        public static void main(String[] args){

            double peso, altura;
            double IMC;
            int escolha;
            String nome;
            Scanner teclado = new Scanner(System.in);

            System.out.printf("Informe o primeiro peso\n");
            peso = teclado.nextDouble();

            System.out.printf("Informe o segundo altura\n");
            altura = teclado.nextFloat();

            IMC = peso / (altura * altura);
            System.out.println("IMC é de " + IMC);

            if (IMC >= 40) {System.out.println("Obesidade 3");}
                else if (IMC >= 35) {System.out.println("Obesidade 2");}
                    else if (IMC >= 30) {System.out.println("Obesidade 1");}
                        else if (IMC >= 25) {System.out.println("Acima do peso");}
                            else if (IMC >= 18.5){System.out.println("Peso normal");}
                                else if (IMC >= 17) {System.out.println("Abaixo do peso");}
                                    else {System.out.println("Muito abaixo do peso");}
        }
}
