package model;

public class Eclusa{
    private double comprimento;
    private double largura;
    private double nivelDaEclusa;
    private double capacidadeMaxima;
    private double capacidadeMinima;

    private boolean temNavio = false;
    private Navio navio;

    public void setComprimento(double comprimento){
        if(comprimento >= 0 && comprimento <= 300){
            this.comprimento = comprimento;
        }
    }

    public double getComprimento(){
        return comprimento;
    }

    public void setLargura(double largura){
        if(largura >= 0 && largura <= 100){
            this.largura = largura;
        }
    }

    public double getLargura(){
        return largura;
    }

    public void setNivelDaEclusa(double nivelDaEclusa, Rio rio, Mar mar){
        double nivelDoMar = mar.getNivelDoMar();
        double nivelDoRio = rio.getNivelDoRio();

        if(nivelDoMar > nivelDoRio){
            if(nivelDaEclusa <= nivelDoMar && nivelDaEclusa >= nivelDoRio){
                this.nivelDaEclusa = nivelDaEclusa;
            }
        }
        else{
            if(nivelDaEclusa <= nivelDoRio && nivelDaEclusa >= nivelDoMar){
                this.nivelDaEclusa = nivelDaEclusa;
            }
        }
    }

    public void setCapacidadeMaxima(double capacidadeMaxima){
        if(capacidadeMaxima > 0){
            this.capacidadeMaxima = capacidadeMaxima;
        }
    }

    public double getCapacidadeMaxima(){
        return capacidadeMaxima;
    }

    public void setCapacidadeMinima(double capacidadeMinima){
        if(capacidadeMinima > 0){
            this.capacidadeMinima = capacidadeMinima;
        }
    }

    public double getCapacidadeMinima(){
        return capacidadeMinima;
    }

    public void setTemNavio(boolean temNavio){
        this.temNavio = temNavio;
    }

    public boolean getTemNavio(){
        return temNavio;
    }
    
    public void setNavio(Navio navio){
        if(navio != null){
            this.navio = navio;
        }
    }

    public Navio getNavio(){
        return navio;
    }

    public String addNavioNaEclusa(Navio navio){
        if(navio != null && getTemNavio() == false){
            setNavio(navio);
            setTemNavio(true);
            return "Navio adicionado na eclusa\n";
        }
        else if(getTemNavio() == true){
            return "Ja existe um navio na eclusa\n";
        }
    }

    public String realizarPassagemDoNavio(){
        if(getTemNavio() == true && getNavio() != null){
            if(getNavio().getSentido() == "rio_mar"){
                return "A embarcacao passou do Rio para o Mar\n";
            }
            else if(getNavio().getSentido() == "mar_rio"){
                return "A embarcacao passou do Mar para o Rio\n";
            }
            setTemNavio(false);
            setNavio(null);
        }
    }

    public Eclusa(){}

    public Eclusa(double comprimento, double largura, double nivelDaEclusa, Rio rio, Mar mar, double capacidadeMaxima, double capacidadeMinima, double vazao, double preco){
        setComprimento(comprimento);
        setLargura(largura);
        setNivelDaEclusa(nivelDaEclusa, rio, mar);
        setCapacidadeMaxima(capacidadeMaxima);
        setCapacidadeMinima(capacidadeMinima);
        setVazao(vazao);
    }
}