package contacorrente;
public class Main {
    public static void main(String[] args){
    Conta c = new Conta();

    c.setSaldo(500f);
    c.setClienteConta("Maria");
    c.setNumero(479457);

    System.out.println(c.getSaldo);
    System.out.println(c.getClienteConta);
    System.out.println(c.getNumero);
    }
}
