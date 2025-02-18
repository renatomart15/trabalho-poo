package model;

public class Mar{
    private double nivelDoMar;

    public void setNivelDoMar(double nivelDoMar){
        if(nivelDoMar > 0){
            this.nivelDoMar = nivelDoMar;
        }
    }

    public double getNivelDoMar(){
        return nivelDoMar;
    }

    public Mar(){}

    public Mar(double nivelDoMar){
        setNivelDoMar(nivelDoMar);
    }
}