package garagem;
import garagemdovizinho.Motor;
public class Carro {
    private String marca;
    private String cor;
    public Motor motor;

    private void ligar (){
        this.motor.darPartida();
        //O método darPartida() do tipo Motor não é visível.
    }

    public String toString(){
        return marca + " " + cor + " " + motor.potencia;
    }
}
package garagemdovizinho;
public class Motor {
    public int potencia;
    private void darPartida(){}
    }
