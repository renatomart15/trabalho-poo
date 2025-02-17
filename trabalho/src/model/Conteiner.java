package model;

public class Conteiner {
    private double carga; // ate 2 toneladas

    public void setCarga(double carga){
        if(carga >= 0 && carga <= 2){
            this.carga = carga;
        }
    }

    public double getCarga(){
        return carga;
    }
}
