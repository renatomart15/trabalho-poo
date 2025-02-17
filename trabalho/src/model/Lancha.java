package model;

public class Lancha extends Navio {
    ArrayList<Passageiro> passageiros = new ArrayList();

    public void addPasageiros(Passageiro passageiro){
        if((passageiro != null) && passageiros.size() + 1 <= quantMaxPassageiros && passageiro.getPeso() + cargaAtual <= cargaMaxima){
            passageiros.add(passageiro);
            cargaAtual+= passageiro.getPeso();
        }
    }
}
