package model;

public class Passageiro extends Pessoa {
    private String idPassagem;

    public String getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(String idPassagem) {
        this.idPassagem = idPassagem;
    }

    public Passageiro(){}

    public Passageiro(String nome, double peso, String cpf, String idPassagem) {
        setNome(nome);
        setPeso(peso);
        setCpf(cpf);
        setIdPassagem(idPassagem);
    }
}
