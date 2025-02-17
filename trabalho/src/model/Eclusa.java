package model;

public class Eclusa{
    private double comprimento;
    private double largura;
    private double nivelDaEclusa;
    private double capacidadeMaxima;
    private double capacidadeMinima;
    private double vazao;
    //private double tempoParaEncher;
    private double preco; // depende do tipo da embarcação

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

    public void setNivelDaEclusa(double nivelDaEclusa, double nivelDoRio, double nivelDoMar){
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
}