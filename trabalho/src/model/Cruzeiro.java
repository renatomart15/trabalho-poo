package model;

import java.util.ArrayList;

public class Cruzeiro extends Navio {
    private int quantMaxPassageiros;
	ArrayList<Passageiro> passageiros = new ArrayList();

    public void setCargaMaxima(double cargaMaxima){
        if(cargaMaxima > 0){
            this.cargaMaxima = cargaMaxima;
        }
    }

    public void addPasageiros(Passageiro passageiro){
        if((passageiro != null) && passageiros.size() + 1 <= quantMaxPassageiros && passageiro.getPeso() + cargaAtual <= cargaMaxima){
            passageiros.add(passageiro);
            cargaAtual+= passageiro.getPeso();
        }
    }

    public String toString(){
        return "Dimensoes do navio: " + getComprimento() + "x" + getLargura() +
        "\nCarga: " + getCargaAtual() + "/" + getCargaMaxima() +
        "\nPorto de Origem: " + getPortoOrigem() +
        "\nPorto de Destino: " + getPortoDestino() + 
        "\nPais: " + getPais() +
        "\nID: " + getId() +
        "\nCapitao: " + capitao.getNome() +
        "\nSentido: " + getSentido() +
        "\nQuantidade de passageiros: " + passageiros.size() + "/" + quantMaxPassageiros;
    }

    public void Cruzeiro(){}

    public void Cruzeiro(){
        
    } 
}
