package jogo;

import javax.swing.*;
import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        
        int numero = (int) (Math.random()*100 + 1);
        int resposta = 0;
        System.out.println("Cola aqui:\n\n\n\n\n\n\nO número correto pode ser...");
        int cont = 1;

        while (resposta != numero){
        String response = JOptionPane.showInputDialog(null, "Entre com um número de 1 a 100", "Jogo de Adivinhação", 3);
        resposta = Integer.parseInt(response);
        JOptionPane.showMessageDialog(null, ""+ determineGuess(resposta, numero, cont));
        cont++;
        }
}
    
public static String determineGuess(int resposta, int numero, int cont){

    if (resposta <= 0 || resposta > 100){   
        return "Número fora do limite";
    } 
    else if (resposta == numero){
        return "Correto!\nTentativas = " + cont;
    } 
    else if (resposta > numero){
        return "Muito alto, tente outro.\nNúmero: " + cont;
    } 
    else if (resposta < numero){
        return "Muito baixo, tente outro.\nNúmero: " + cont;
    } else {
        return "Inválido, tente outro.\nNúmero: " + cont;
    }
  }
}
