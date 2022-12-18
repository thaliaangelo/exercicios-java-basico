package contaBancaria;

public class Banco {
    public static void main(String[] args){
    
    Cliente cliente1 = new Cliente("José Silva", "098834");
    Cliente cliente2 = new Cliente("Ana Souza", "098834");

    Conta conta1 = new Conta ("000-1", 200.0, 1000.0, cliente1);
    Conta conta2 = new Conta ("000-2", 500.0, 1000.0, "Ana Souza", "07655");
    Conta conta3 = new Conta ("000-3", 700.0, 1000.0, "Antonio Santos", "12345");

    double x;
    System.out.println(conta1.equals(conta2.getNumero()));
    System.out.println(cliente1.equals(cliente2.getCpf()));

    x = conta3.getSaldo();
    System.out.println("Saldo de " + conta3.getCliente().getNome()+" = R$ " + x);
    }
}
