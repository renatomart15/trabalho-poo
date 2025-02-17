package model;

public class Cruzeiro extends Navio {
	ArrayList<Passageiro> passageiros = new ArrayList();

    public void addPasageiros(Passageiro passageiro){
        if(passageiro != null){
            passageiros.add(passageiro);
        }
    }
}
