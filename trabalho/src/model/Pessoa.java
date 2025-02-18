package model;

public class Pessoa {
    private String nome;
    private double peso;
    private String cpf;
    

    public void setCpf(String cpf){
        if(cpf.length() == 11){
            this.cpf = cpf;
        }
    }

    public String getCpf(){
        return cpf;
    }

    public void setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
        }
    }

    public double getPeso(){
        return peso;
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

    public Pessoa(String nome, double peso, String cpf){
        setNome(nome);
        setPeso(peso);
        setCpf(cpf);
    }
}
