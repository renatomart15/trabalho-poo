package model;

public class Capitao extends Pessoa {
    private Navio navio;

    public void setNavio(Navio navio){
        if(navio != null){
            this.navio = navio;
        }
    }

    public Navio getNavio(){
        return navio;
    }

    public Capitao(){}

    public Capitao(String cpf, double peso, String nome){
        setCpf(cpf);
        setPeso(peso);
        setNome(nome);
    }

    public Capitao(String cpf, double peso, String nome, Navio navio){
        setCpf(cpf);
        setPeso(peso);
        setNome(nome);
        setNavio(navio);
    }
}
