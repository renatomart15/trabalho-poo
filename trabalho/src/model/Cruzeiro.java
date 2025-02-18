package model;

import java.util.ArrayList;

public class Cruzeiro extends Navio {
    private int quantMaxPassageiros;
	ArrayList<Passageiro> passageiros = new ArrayList();

    public void setQuantMaxPassageiros(int quantMaxPassageiros){
        if(quantMaxPassageiros > 0){
            this.quantMaxPassageiros = quantMaxPassageiros;
        }
    }

    public void addPasageiros(Passageiro passageiro){
        if((passageiro != null) && passageiros.size() + 1 <= quantMaxPassageiros && passageiro.getPeso() + getCargaAtual() <= getCargaMaxima()){
            passageiros.add(passageiro);
            adicionarCarga(passageiro.getPeso());
        }
    }

    public String toString(){
        return "Dimensoes do navio: " + getComprimento() + "x" + getLargura() +
        "\nCarga: " + getCargaAtual() + "/" + getCargaMaxima() +
        "\nPorto de Origem: " + getPortoOrigem() +
        "\nPorto de Destino: " + getPortoDestino() + 
        "\nPais: " + getPais() +
        "\nID: " + getId() +
        "\nCapitao: " + getCapitao().getNome() +
        "\nSentido: " + getSentido() +
        "\nQuantidade de passageiros: " + passageiros.size() + "/" + quantMaxPassageiros;
    }

    public void Cruzeiro(){}

    public Cruzeiro(double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido, int quantMaxPassageiros){
        super(comprimento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);
        setQuantMaxPassageiros(quantMaxPassageiros);
    }
}
