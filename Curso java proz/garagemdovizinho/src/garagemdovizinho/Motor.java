package garagemdovizinho;
public class Motor {
    public int potencia;
    public void darPartida(){}
}
package garagem;
import garagemdovizinho.Motor;
public class Carro {
    public String marca;
    public String cor;
    public Motor motor;

    public void ligar(){
        this.motor.darPartida();
    }

    public String toString(){
        return marca + " " + cor + " " + motor.potencia;
    }
}
