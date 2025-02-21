package model;

public class Capitao extends Pessoa{
    private String nomeNavio;

    public void setNomeNavio(String nomeNavio){
        if(nomeNavio != null){
            this.navio = navio;
        }
    }

    public Capitao(){}

    public Capitao(String cpf, double peso, String nome, Navio navio){
        setCpf(cpf);
        setPeso(peso);
        setNome(nome);
        setNavio(navio);
    }
}
