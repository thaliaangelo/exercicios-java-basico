package desafio;
public class Carro {
    public static void main(String[] args) {
    }

    String nomeCarro, modelo, ano, motor ,nomePiloto;
    double potencia;

    public String apresentar(){
    return ("Carro: " + this.nomeCarro + "\nModelo: " + this.modelo + "\nPotência: " + this.potencia + "\nMotor: " + this.motor + "\nAno: " + this.ano + "\nNome Piloto" + this.nomePiloto);
    }

    public String status(String lugar){
        if (lugar == "Empate"){
            return ("Empate!");
        } else {
            return (nomePiloto + " Ficou na posição: " + lugar);
        }
    }

    public void setNomeCarro(String nome){
    this.nomeCarro = nome;
    }

    public void setModelo(String model){
    this.modelo = model;
    }

    public void setPotencia(double pot){
    this.potencia = pot;
    }

    public void setMotor(String mot){
    this.motor = mot;
    }

    public void setNomePiloto(String nome){
    this.nomePiloto = nome;
    }

    public void setAno(String yr){
    this.ano = yr;
    }

    public String ganharRace(){
        return (this.nomePiloto + " venceu a corrida");
    }

    public String perderRace(){
        return (this.nomePiloto + " perdeu a corrida");
    }   

    public String empatarRace() {
        return (this.nomePiloto + " empatou");
    }

    }   

    
