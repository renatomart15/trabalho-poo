package model;

public class Eclusa{
    private double comprimento;
    private double largura;
    private double nivelDaEclusa;
    private double capacidadeMaxima;
    private double capacidadeMinima;
    private double vazao;
    //private double tempoParaEncher;
    //private double preco; // depende do tipo da embarcação

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

    public void setVazao(double vazao){
        if(vazao > 0){
            this.vazao = vazao;
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