package onibus;
import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args){
    
        Onibus onibus1 = new Onibus();
        Onibus onibus2 = new Onibus();
        Onibus onibus3 = new Onibus();
        Passageiro passageiro1 = new Passageiro();
        Scanner input = new Scanner(System.in);
        String[][] assentosonibus = {{"0"},{"0"}};
        onibus1.placa = "ABC1234";
        onibus1.motorista = "José";
        onibus1.destino = "Campinas";
        onibus1.partida = "10h30";
        onibus1.status = true;
        onibus1.assentos[1][10] = "Ocupado";
        onibus1.assentos[1][12] = "Ocupado";
        onibus1.assentos[1][13] = "Ocupado";
        onibus1.assentos[1][15] = "Ocupado";
        onibus1.assentos[1][5] = "Ocupado";
        
        onibus2.placa = "DEF1234";
        onibus2.motorista = "Marcos";
        onibus2.destino = "Campinas";
        onibus2.partida = "11h30";
        onibus2.status = true;
        onibus2.assentos[1][5] = "Ocupado";
        onibus2.assentos[1][5] = "Ocupado";
        onibus2.assentos[1][6] = "Ocupado";
        onibus2.assentos[1][7] = "Ocupado";
        onibus2.assentos[1][8] = "Ocupado";
        onibus2.assentos[1][9] = "Ocupado";

        onibus3.placa = "GHI1234";
        onibus3.motorista = "Fernando";
        onibus3.destino = "Campinas";
        onibus3.partida = "12h30";
        onibus3.status = false;
        passageiro1.assento = -1;
        String onibusescolhido [] = new String[4];

        System.out.println("Qual é o nome do passageiro ? ");

        passageiro1.setPassageiro(input.nextLine());

        System.out.println("Qual é o RG do passageiro ? ");

        passageiro1.setRg(input.nextLine());

        if (onibus1.status == true){
            System.out.println("O ônibus 1 está disponível");
        }else{
            System.out.println("O ônibus 1 está indsponível");
        }
        
        if (onibus2.status == true){
            System.out.println("O ônibus 2 está disponível");
        }else{
            System.out.println("O ônibus 2 está indisponível");
        }

        if(onibus3.status == true){
            System.out.println("O ônibus 3 está diponível");
        }else{
            System.out.println("O ônibus 3 está indisponível");

        System.out.println("Escolha um ônibus de 1 a 3: ");
        }

        switch(input.nextLine()){
            case "1" :
            onibusescolhido[0] = "1";
            onibusescolhido[1] = onibus1.partida;
            onibusescolhido[2] = onibus1.motorista;
            onibusescolhido[3] = onibus1.destino;

            System.out.println("Ônibus 1 - Assentos: ");
            assentosonibus = onibus1.assentos;

            for (int i = 1; i < 2; i++){
                for (int j = 0; j < 20; j++){
                    System.out.print("Assento " + (j+1) + " " + onibus1.assentos[i][j] + " ");
                    System.out.println();
                    }
                }   
                System.out.print("Escolha o assento: ");
                passageiro1.assento = input.nextInt();

                break;
                
            case "2":
            onibusescolhido[0] = "2";
            onibusescolhido[1] = onibus2.partida;
            onibusescolhido[2] = onibus2.motorista;
            onibusescolhido[3] = onibus2.destino;
            System.out.println("Ônibus 2 - Assentos: ");
            assentosonibus = onibus2.assentos;

            for(int i = 1; i < 2; i++){
                for (int j = 0; j < 20; j++){
                    System.out.print("Assento " + (j+1) + " " + onibus2.assentos[i][j] + " ");
                    System.out.println();
                }
            }
            
            System.out.print("Escolha o assento: ");
            passageiro1.assento = input.nextInt();
            break;

            case "3":
            onibusescolhido[0] = "3";

            System.out.println("Ônibus 3 indisponível.");

            break;

            default:
            onibusescolhido[0] = "4";
            System.out.println("Ônibus selecionado inválido.");
        }
    
    if((onibusescolhido[0] == "1" || onibusescolhido[0] == "2") && (passageiro1.assento >=1 && passageiro1.assento <=20)){
        if (assentosonibus[1][passageiro1.assento-1] != "Disponível"){
            System.out.println("Assento ocupado!");
        }else{
        assentosonibus[1][passageiro1.assento-1] = "Ocupado - Seu Lugar";
        System.out.println("Assento " + passageiro1.assento + " reservado!");
        System.out.println("Dados do passageiro: ");
        System.out.println("Nome: " + passageiro1.passageiro);
        System.out.println("RG: " + passageiro1.rg);
        System.out.println("Número do Ônibus: " + onibusescolhido[0]);
        System.out.println("Assento: " + passageiro1.assento);
        System.out.println("Horário: " + onibusescolhido[1]);
        System.out.println("Motorista: " + onibusescolhido[2]);
        System.out.println("Destino: " + onibusescolhido[3]);
        System.out.println("Confira seu lugar abaixo");

        for (int i = 1; i < 2; i++){
            for (int j = 0; j < 20; j++){
                System.out.println ("Assento " + (j+1) + " " + assentosonibus[i][j] + " ");
                System.out.println();
                }
            }
            
            System.out.println("Boa viagem!");
        }
    }else{
        System.out.println("Informação inválida. Tente novamente!");
         }
    }
}

