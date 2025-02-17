package model;

public class NavioCargueiro extends Navio {
    private int quantMaxConteiners;
    ArrayList<Conteiner> conteiners = new ArrayList();

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
}
