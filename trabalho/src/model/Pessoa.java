package model;

public abstract class Pessoa {
    private String nome;    

    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }

    public String getNome(){
        return nome;
    }

    public Pessoa(){}

    public Pessoa(String nome){
        setNome(nome);
    }
}
