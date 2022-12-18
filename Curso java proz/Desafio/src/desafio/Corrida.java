package desafio;
public class Corrida{
    public static void main(String[] args){
    }

    Carro desafiante = new Carro();
    Carro desafiado = new Carro();

    double disputa [] = new double[2];
    String aprovada [] = new String[2];
    
    public String marcarCorrida(){
        if (desafiante.nomePiloto == desafiado.nomePiloto){
        return ("Corrida não pode ser iniciada, competidores precisam ser diferentes. \nDesafiante: " + desafiante.nomePiloto + "\nDesafiado: " + desafiado.nomePiloto);
        }else{
        return ("Competidores diferentes, corrida será iniciada \nDesafiante: " + desafiante.nomePiloto + "\nDesafiado: " + desafiado.nomePiloto);
        }
    }
    
    public String correr(){
        disputa[0] = (Math.ceil(Math.random()*100) * desafiante.potencia);
        disputa[1] = (Math.ceil(Math.random()*100) * desafiado.potencia);

        if (disputa[0] > disputa[1]) {
            aprovada[0] = desafiante.ganharRace();
            aprovada[1] = desafiado.perderRace();
            return (desafiante.status("1") + "\n" + desafiado.status("2") + "\n" + aprovada[0] + "\n" + aprovada[1] + "\nTempo corrida Desafiante " + desafiante.nomePiloto + " = " + Integer.toString((int)disputa[0]) + " segundos" + "\nTempo corrida Desafiado " + desafiado.nomePiloto + " = " + Integer.toString((int)disputa[1]) + " segundos");

        }else if (disputa[0] == disputa[1]){
            aprovada[0] = desafiante.empatarRace();
            aprovada[0] = desafiado.empatarRace();
            return (desafiante.status("Empate") + "\n" + desafiado.status("Empate") + "\n" + aprovada[0] + "\n" + aprovada[1] + "\nTempo corrida Desafiante " + desafiante.nomePiloto + " = " + Integer.toString((int)disputa[0]) + " segundos" + "\nTempo corrida Desafiado " + desafiado.nomePiloto + " = " + Integer.toString((int)disputa[1]) + " segundos");

        }else{
            aprovada[0] = desafiante.perderRace();
            aprovada[1] = desafiado.ganharRace();
            return (desafiante.status("2") + "\n" + desafiado.status("1") + "\n" + aprovada[0] + "\n" + aprovada[1] + "\nTempo corrida Desafiante " + desafiante.nomePiloto + " = " + Integer.toString((int)disputa[0]) + " segundos" + "\nTempo corrida Desafiado " + desafiado.nomePiloto + " = " + Integer.toString((int)disputa[1]) + " segundos");
        }
        
    }
}

