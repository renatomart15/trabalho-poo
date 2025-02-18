package model;

import java.util.ArrayList;

public class Lancha extends Navio {
    private int quantMaxPassageiros;
    ArrayList<Passageiro> passageiros = new ArrayList();

    public void addPasageiros(Passageiro passageiro){
        if((passageiro != null) && passageiros.size() + 1 <= quantMaxPassageiros && passageiro.getPeso() + getCargaAtual() <= getCargaMaxima()){
            passageiros.add(passageiro);
            adicionarCarga(passageiro.getPeso());
        }
    }

    public Lancha(){}

    public Lancha(double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido){
        super(comprimento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);
    }
}
