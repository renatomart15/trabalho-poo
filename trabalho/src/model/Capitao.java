package model;

public class Capitao extends Pessoa{
    private String nomeNavio;

    public void setNomeNavio(String nomeNavio){
        if(nomeNavio != null){
            this.nomeNavio = nomeNavio;
        }
    }

    public Capitao(){}

    public Capitao(String nome, String nomeNavio){
        setNome(nome);
        setNomeNavio(nomeNavio);
    }
}
