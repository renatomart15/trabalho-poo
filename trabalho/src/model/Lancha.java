package model;

import java.util.ArrayList;

public class Lancha extends Embarcacao{
    private int quantMaxPassageiros;
    ArrayList<Passageiro> passageiros = new ArrayList();

    public void addPasageiros(Passageiro passageiro){
        if((passageiro != null) && passageiros.size() + 1 <= quantMaxPassageiros){
            passageiros.add(passageiro);
        }
    }

    public Lancha(){}

    public Lancha(double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido){
        super(comprimento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);
    }
}
