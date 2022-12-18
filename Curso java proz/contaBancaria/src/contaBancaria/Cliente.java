package contaBancaria;

public class Cliente {
    private String cpf;
    private String nome;

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Cliente(String cpf){
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(){
        this.nome = null;
        this.cpf = null;
    }

    public boolean equals(String cpf){
        if(this.cpf.equals(cpf)){
            return true;
        } else {
            return false;
            }
    }
}
