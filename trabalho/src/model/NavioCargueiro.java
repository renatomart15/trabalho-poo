package model;

import java.util.ArrayList;

public class NavioCargueiro extends Embarcacao{
    private int quantMaxConteiners;
    ArrayList<Conteiner> conteiners = new ArrayList();

    private int quantMaxTripulantes;

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
        if((getCarga() + conteiner.getCarga() <= getCargaMaxima()) && conteiners.size() + 1 <= quantMaxConteiners){
            conteiners.add(conteiner);
            adicionarCarga(conteiner.getCarga());
        }
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
        "\nQuantidade de conteiners: " + conteiners.size() + "/" + quantMaxConteiners;
    }

    public NavioCargueiro(){}

    public NavioCargueiro(String nome, double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido, int quantMaxConteiners){
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
        setQuantMaxConteiners(quantMaxConteiners);
    }
}