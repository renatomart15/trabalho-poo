package model;

public class Capitao extends Pessoa{
    private String nomeNavio;

    public void setNomeNavio(String nomeNavio){
        if(nomeNavio != null){
            this.navio = navio;
        }
    }

    public Capitao(){}

    public Capitao(String cpf, String nome){
        setCpf(cpf);
        setNome(nome);
    }
}
