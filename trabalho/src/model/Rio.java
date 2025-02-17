package model;

import model.exceptions.NivelDoRioInvalidoException;

public class Rio {
    private double nivelDoRio;

    public Rio(double nivelDoRio) {
        if (nivelDoRio > 0) { // O nível do rio deve ser maior que 0
            this.nivelDoRio = nivelDoRio;
        } else {
            throw new NivelDoRioInvalidoException("Erro: O nível do rio deve ser maior que zero.");
        }
    }

    public double getNivelDoRio() {
        return nivelDoRio;
    }

    public void setNivelDoRio(double nivelDoRio) {
        if (nivelDoRio > 0) { // Mantendo a restrição
            this.nivelDoRio = nivelDoRio;
        } else {
            throw new NivelDoRioInvalidoException("Erro: O nível do rio deve ser maior que zero.");
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

