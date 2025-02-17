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
}
