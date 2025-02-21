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

    public Lancha(String nome, double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido){
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
    }
}
