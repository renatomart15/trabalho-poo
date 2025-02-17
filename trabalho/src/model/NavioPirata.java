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
}