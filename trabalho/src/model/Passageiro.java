package model;

public class Passageiro extends Pessoa {
    private String idPassagem;

    public String getIdPassagem(){
        return idPassagem;
    }

    public void setIdPassagem(String idPassagem){
        this.idPassagem = idPassagem;
    }

    public Passageiro(){}

    public Passageiro(String nome, String idPassagem) {
        setNome(nome);
        setIdPassagem(idPassagem);
    }
}
