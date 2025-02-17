package model;

public class Passageiro extends Pessoa {
    private String idPassagem;

    public Passageiro(String nome, int cpf, String idPassagem) {
        super(nome, cpf);
        this.idPassagem = idPassagem;
    }

    public String getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(String idPassagem) {
        this.idPassagem = idPassagem;
    }

    public Passageiro(){}

    public Passageiro(String nome, double peso, String cpf, String idPassagem){
        super(nome, peso, cpf);
        setIdPassagem(idPassagem);
    }
}
