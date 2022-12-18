package contaBancaria;

public class Conta {
    private String numero;
    private double saldo, limite;
    private Cliente cliente;

    public Cliente getCliente(){
        return this.cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public Conta(String numero, double saldo, double limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public Conta(String numero, double saldo, double limite, String nome, String cpf){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = new Cliente(nome, cpf);
    }

    void creditar(double valor){
        if(this.saldo + valor <= this.limite){
            this.saldo = this.saldo + valor;
            System.out.println("Crédito realizado com sucesso!");
        } else {
            System.out.println("A operação não pode ser realizada");
            }
    }

    void debitar(double valor){
        if(saldo < valor){
            System.out.println("A operação não pode ser realizada.");
        } else {
            saldo = saldo - valor;
            //saldo -= valor;
            System.out.println("Débito realizado com sucesso!!");
        }
    }

    void transferir(double valor, Conta contaDestino){
        if((saldo >= valor) && (contaDestino.saldo + valor <= contaDestino.limite)){
            this.saldo = this.saldo - valor;
            contaDestino.creditar(valor);
        } else {
            System.out.println("A operação não pode ser realizada.");
        }
    }

    public boolean equals(String numero){
        return this.numero.equals(numero);
    }
}

