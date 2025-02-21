package model;

import java.util.ArrayList;

public class NavioCargueiro extends Embarcacao{
    private int quantMaxConteiners;
    ArrayList<Conteiner> conteiners = new ArrayList();

    private int quantMaxTripulantes;
    ArrayList<Tripulante> tripulacao = new ArrayList();

    public void setQuantMaxConteiners(int quantMaxConteiners){
        if(quantMaxConteiners > 0){
            this.quantMaxConteiners = quantMaxConteiners;
        }
    }

    public int getQuantMaxConteiners(){
        return quantMaxConteiners;
    }

    public void setQuantMaxTripulantes(int quantMaxTripulantes){
        if(quantMaxTripulantes > 0){
            this.quantMaxTripulantes = quantMaxTripulantes;
        }
    }

    public int getQuantMaxTripulantes(){
        return quantMaxTripulantes;
    }

    public void addConteiner(Conteiner conteiner){
        if((getCargaAtual() + conteiner.getCarga() <= getCargaMaxima()) && conteiners.size() + 1 <= quantMaxConteiners){
            conteiners.add(conteiner);
            adicionarCarga(conteiner.getCarga());
        }
    }

    public void addTripulante(Tripulante tripulante){
        if((tripulante != null) && (tripulacao.size() + 1 <= quantMaxFuncionarios)){
            tripulacao.add(tripulante);
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
        "\nQuantidade de conteiners: " + conteiners.size() + "/" + quantMaxConteiners;
    }

    public NavioCargueiro(){}

    public NavioCargueiro(double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido, int quantMaxConteiners){
        super(comprimento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);
        setQuantMaxConteiners(quantMaxConteiners);
    }
}