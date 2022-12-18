package onibus2;
import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Onibus2 o1 = new Onibus2();
        Onibus2 o2 = new Onibus2();
        Onibus2 o3 = new Onibus2();

        Passageiro p1 = new Passageiro();
        Passageiro p2 = new Passageiro();
        Passageiro p3 = new Passageiro();

        o1.nomeMotorista = "José";
        o1.nroPlaca = "40XV5";
        o1.qntdAssentos = 30;
        o1.cidadeDestino = "Rio de Janeiro";
        o1.status = "Novo";
        o1.horarioPartida = "20:00";
        
        o2.nomeMotorista = "Gabriel";
        o2.nroPlaca = "TH19G";
        o2.qntdAssentos = 30;
        o2.cidadeDestino = "Bahia";
        o2.status = "Novo";
        o2.horarioPartida = "14:00";

        o3.nomeMotorista = "Vinicyus";
        o3.nroPlaca = "NI14V";
        o3.qntdAssentos = 30;
        o3.cidadeDestino = "Minas Gerais";
        o3.status = "Novo";
        o3.horarioPartida = "02:00";

        //coleta de dados passageiro 1
        System.out.println("DADOS PASSAGEIRO 1: ");
        System.out.println("Nome do passageiro: ");
        p1.nomePassageiro = scan.nextLine();
        System.out.println("Identidade do passageiro: ");
        p1.identidade = scan.nextLine();
        System.out.println("Assento");
        p1.assentoDesignado = scan.nextInt();
        p1.status = "Indisponível";

        System.out.println("DADOS PASSAGEIROS 2: ");

        // coleta de dados passageiro 2
        System.out.println("Nome do passageiro: ");
        p2.nomePassageiro = scan.nextLine();
        p2.nomePassageiro = scan.nextLine();
        System.out.println("Identidade do passageiro: ");
        p2.identidade = scan.nextLine();
        System.out.println("Assento");
        p2.assentoDesignado = scan.nextInt();
            if (p2.assentoDesignado == p1.assentoDesignado){
                System.out.println("Escolha um assento diferente: ");
                p2.assentoDesignado = scan.nextInt();
        }
        p2.status = "Indisponível";

        System.out.println("DADOS PASSAGEIRO 3: ");

        //coleta de dados passageiro 3
        System.out.println("Nome do passageiro: ");
        p3.nomePassageiro = scan.nextLine();
        p3.nomePassageiro = scan.nextLine();
        System.out.println("Identidade do passageiro: ");
        p3.identidade = scan.nextLine();
        System.out.println("Assento: ");
        p3.assentoDesignado = scan.nextInt();
            if (p3.assentoDesignado == p1.assentoDesignado || p3.assentoDesignado == p2.assentoDesignado){
                System.out.println("Escolha um assento diferente: ");
                p3.assentoDesignado = scan.nextInt();
        }
        p3.status = "Indisponível";

        System.out.println("Ônibus 1: \n Nome Motorista: " + o1.nomeMotorista + "\n Horario de partida: " + o1.horarioPartida + "\n Cidade de destino: " + o1.cidadeDestino + "\n Numero da placa: " + o1.nroPlaca + "\n Quantidade de assentos: " + o1.qntdAssentos + "\n Status do onibus: " + o1.status);
        
        System.out.println();

        System.out.println("Ônibus 2: \n Nome motorista: " + o2.nomeMotorista + "\n Horario de partida: " + o2.horarioPartida + "\n Cidade de destino: " + o2.cidadeDestino + "\n Numero da placa: " + o2.nroPlaca + "\n Quantidade de assentos: " + o2.qntdAssentos + "\n Status do onibus: " + o2.status);
        
        System.out.println();

        System.out.println("Ônibus 3: \n Nome motorista: " + o3.nomeMotorista + "\n Horario de partida: " + o3.horarioPartida + "\n Cidade de destino: " + o3.cidadeDestino + "\n Numero da placa: " + o3.nroPlaca + "\n Quantidade de assentos: " + o3.qntdAssentos + "\n Status do onibus: " + o3.status);

        System.out.println();

        System.out.println("Assento " + p1.assentoDesignado+": Nome do pasageiro: " + p1.nomePassageiro+"\n Identidade passageiro: " + p1.identidade + "\n Status do assento: " + p1.status);

        System.out.println();

        System.out.println("Assento " + p2.assentoDesignado+": Nome do passageiro: " + p2.nomePassageiro+"\n Identidade passageiro: " + p2.identidade + "\n Status do assento: " + p2.status);

        System.out.println();

        System.out.println("Assento " + p3.assentoDesignado + ": Nome do passageiro: " + p3.nomePassageiro+"\n Identidade passageiro: "+ p3.identidade + "\n Status do assento: " + p3.status);
    }
}
