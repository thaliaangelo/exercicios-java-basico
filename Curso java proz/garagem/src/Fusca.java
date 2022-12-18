package garagem;
public class Fusca extends Carro {

    public Fusca(){
        this.cor = "Branco"; // O campo Carro.cor não é visível.
        this.marca = "VW"; // O campo Carro.marca não é visível.
        this.ligar(); // O método ligar() do tipo Carro não é visível.
        this.motor.darPartida(); // O método darPartida() do tipo Motor não é visível.
        this.motor.potencia = 100;
        this.toString();
    }
}
