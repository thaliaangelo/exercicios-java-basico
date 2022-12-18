package desafio;
public class CorridaDeRua {
    public static void main(String[] args){
         
    Corrida corrida1 = new Corrida();
    Corrida corrida2 = new Corrida();

    //Corrida 1 Desafiante
    corrida1.desafiante.setNomeCarro("Tyrrell");
    corrida1.desafiante.setModelo("P34");
    corrida1.desafiante.setPotencia(75);
    corrida1.desafiante.setMotor("XYZ");
    corrida1.desafiante.setAno("1976");
    corrida1.desafiante.setNomePiloto("José");

    //Corrida 1 Desafiado
    corrida1.desafiado.setNomeCarro("Brabham");
    corrida1.desafiado.setModelo("BT46B");
    corrida1.desafiado.setPotencia(100);  
    corrida1.desafiado.setMotor("XPTO");
    corrida1.desafiado.setAno("1978");
    corrida1.desafiado.setNomePiloto("Souza");

    //Corrida 2 Desafiante
    corrida2.desafiante.setNomeCarro("Williams");
    corrida2.desafiante.setModelo("FW14B");
    corrida2.desafiante.setPotencia(200);
    corrida2.desafiante.setMotor("ABC");
    corrida2.desafiante.setAno("1992");
    corrida2.desafiante.setNomePiloto("Carlos");

    //Corrida 2 Desafiado
    corrida2.desafiado.setNomeCarro("Chaparral");
    corrida2.desafiado.setModelo("2J");
    corrida2.desafiado.setPotencia(45);
    corrida2.desafiado.setMotor("DEF");
    corrida2.desafiado.setAno("1970");  
    corrida2.desafiado.setNomePiloto("Silva");

    System.out.println("Corrida 1: ");
    System.out.println("");
    System.out.println(corrida1.marcarCorrida());
    System.out.println("");
    System.out.println(corrida1.desafiante.apresentar());
    System.out.println("");
    System.out.println(corrida1.desafiado.apresentar());
    System.out.println("");
    System.out.println("Resultados: ");
    System.out.println("");
    System.out.println("Corrida1: ");
    System.out.println("");
    System.out.println(corrida1.correr());
    System.out.println("");
    System.out.println("");     

    System.out.println("Corrida 2: ");
    System.out.println("");
    System.out.println(corrida2.marcarCorrida());
    System.out.println("");
    System.out.println(corrida2.desafiante.apresentar());
    System.out.println("");
    System.out.println(corrida2.desafiado.apresentar());
    System.out.println("");
    System.out.println("Resultados: ");
    System.out.println("");
    System.out.println("Corrida 2: ");
    System.out.println("");
    System.out.println(corrida2.correr()); 
    }
}
