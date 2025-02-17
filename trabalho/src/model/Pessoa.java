package model;

public abstract class Pessoa {
    private String cpf;
    private String nome;

    public void setCpf(String cpf){
        if(cpf.length() == 11){
            this.cpf = cpf;
        }
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }

    public String getNome(){
        return nome;
    }

    public Pessoa(){}

    public Pessoa(String cpf, String nome){
        setCpf(cpf);
        setNome(nome);
    }
}
