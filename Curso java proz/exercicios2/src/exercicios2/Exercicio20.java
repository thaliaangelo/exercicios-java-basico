package exercicios2;

import java.util.Scanner;

public class Exercicio20 {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            
            for (int i = 1; i <= 10; i++){
                int produto = i * N;
                System.out.println(i + " x " + N + " = " + produto);
            }

            sc.close();
        }
}
