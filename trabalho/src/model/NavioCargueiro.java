package model;

import java.util.ArrayList;

public class NavioCargueiro extends Navio {
    private int quantMaxConteiners;
    ArrayList<Conteiner> conteiners = new ArrayList();

    private int quantMaxFuncionarios;
    ArrayList<Funcionario> tripulacao = new ArrayList();

    public int getQuantAtualConteiners(){
        return quantAtualConteiners;
    }

    public void setQuantMaxConteiners(int quantMaxConteiners){
        if(quantMaxConteiners > 0){
            this.quantMaxConteiners = quantMaxConteiners;
        }
    }

    public int getQuantMaxConteiners(){
        return quantMaxConteiners;
    }

    public void addConteiner(Conteiner conteiner){
        if((getCargaAtual() + conteiner.getCarga() <= getCargaMaxima()) && conteiners.size() + 1 <= quantMaxConteiners){
            conteiners.add(conteiner);
            quantAtualConteiners++;
            cargaAtual += conteiner.getCarga();
        }
    }

    private void setQuantMaxFuncionarios(int quantMaxFuncionarios){
        if(quantMaxFuncionarios > 0){
            this.quantMaxFuncionarios = quantMaxFuncionarios;
        }
    }

    public void addTripulacao(Funcionario funcionario){
        if((funcionario != null) && (funcionario.getPeso() + cargaAtual <= cargaMaxima) && (tripulacao.size() + 1 <= quantMaxFuncionarios)){
            funcionarios.add(funcionario);
            cargaAtual += funcionario.getPeso();
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
        "\nQuantidade de conteiners: " + conteiners.size() + "/" + quantMaxConteiners;
    }

    public NavioCargueiro(){}

    public NavioCargueiro(double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido, int quantMaxConteiners){
        super(compriento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);
        setQuantMaxConteiners(quantMaxConteiners);
    }
}