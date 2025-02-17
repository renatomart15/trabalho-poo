package model;

public class Lancha extends Navio {
    ArrayList<Passageiro> passageiros = new ArrayList();

    public void addPasageiros(Passageiro passageiro){
        if((passageiro != null) && passageiros.size() + 1 <= quantMaxPassageiros && passageiro.getPeso() + cargaAtual <= cargaMaxima){
            passageiros.add(passageiro);
            cargaAtual+= passageiro.getPeso();
        }
    }

    public Lancha(){}

    public Lancha(double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido){
        super(comprimento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);
    }
}
