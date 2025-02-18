package model;

public class Rio {
    private double nivelDoRio;

    public double getNivelDoRio() {
        return nivelDoRio;
    }

    public void setNivelDoRio(double nivelDoRio) {
        if (nivelDoRio > 0){ 
            this.nivelDoRio = nivelDoRio;
        }
    }

    @Override
    public String toString() {
        return "Nível do Rio: " + nivelDoRio + " metros";
    }

    public Rio(){}

    public Rio(double nivelDoRio){
        setNivelDoRio(nivelDoRio);
    }
}

