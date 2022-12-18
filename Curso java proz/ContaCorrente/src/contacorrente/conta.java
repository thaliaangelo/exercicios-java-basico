package contacorrente;
public class conta {
    public static void main(String[] args){
}
    private float saldo;
    private Cliente clienteConta;
    private int numero;

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float novoSaldo){
    saldo = novoSaldo;
    }

    public Cliente getClienteConta(){
        return clienteConta;
    }

    public void setClienteConta(Cliente novoCliente){
    clienteConta = novoCliente;
    }

    public int getNumero(){
    return numero;
    }

    public void setNumero(int num){
    numero = num;
    }

}
