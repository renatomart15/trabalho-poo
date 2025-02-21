package model;

import java.util.ArrayList;

public class Cruzeiro extends Embarcacao {
    private int quantMaxPassageiros;

    public void setQuantMaxPassageiros(int quantMaxPassageiros){
        if(quantMaxPassageiros > 0){
            this.quantMaxPassageiros = quantMaxPassageiros;
        }
    }

    public int getQuantMaxPassageiros(){
        return quantMaxPassageiros;
    }

    public String toString(){
        return "Dimensoes do navio: " + getComprimento() + "x" + getLargura() +
        "\nCarga: " + getCarga() + "/" + getCargaMaxima() +
        "\nPorto de Origem: " + getPortoOrigem() +
        "\nPorto de Destino: " + getPortoDestino() + 
        "\nPais: " + getPais() +
        "\nID: " + getId() +
        "\nCapitao: " + getCapitao().getNome() +
        "\nSentido: " + getSentido() +
        "\nQuantidade Max. de passageiros: " + quantMaxPassageiros;
    }

    public void Cruzeiro(){}

    public Cruzeiro(String nome, double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido, int quantMaxPassageiros){
        setNome(nome);
        setComprimento(comprimento);
        setLargura(largura);
        setCargaMaxima(cargaMaxima);
        setPortoOrigem(portoOrigem);
        setPortoDestino(portoDestino);
        setPais(pais);
        setId(id);
        setCapitao(capitao);
        setSentido(sentido);
        setQuantMaxPassageiros(quantMaxPassageiros);
    }
}
