package model;

public class NavioPirata extends Navio {
    private int quantMaxFuncionarios;
    ArrayList<Funcionario> tripulacao = new ArrayList();

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

    public String DispararCanhao(){
        return "Booom!!!";
    }

    public String toString(){
        return "Dimensoes do navio: " + getComprimento() + "x" + getLargura() +
        "\nCarga: " + getCargaAtual() + "/" + getCargaMaxima() +
        "\nPorto de Origem: " + getPortoOrigem() +
        "\nPorto de Destino: " + getPortoDestino() + 
        "\nPais: " + getPais() +
        "\nID: " + getId() +
        "\nCapitao: " + capitao.getNome() +
        "\nSentido: " + getSentido();
    }

    public NavioPirata(){}

    public NavioPirata(double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido, int quantMaxFuncionarios){
        super(compriento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);
        setQuantMaxFuncionarios(quantMaxFuncionarios);
    }
}