package model;

import java.util.LinkedList;
import java.util.Queue;

public class Eclusa{
    private double comprimento;
    private double largura;
    private boolean cheia = false; // true = nível do mar, false = nível do rio
    private Queue<Embarcacao> filaDeEspera;
    private Queue<Embarcacao> listaDeEmbarcacoes;

    public void setComprimento(double comprimento){
        if(comprimento >= 0 && comprimento <= 300){
            this.comprimento = comprimento;
        }
    }

    public double getComprimento(){
        return comprimento;
    }

    public void setLargura(double largura){
        if(largura >= 0 && largura <= 100){
            this.largura = largura;
        }
    }

    public double getLargura(){
        return largura;
    }

    public void adicionarEmbarcacao(Embarcacao embarcacao){
        listaDeEmbarcacoes.add(embarcacao);
    }

    public void adicionarEmbarcacaoNaFila(Embarcacao embarcacao){
        filaDeEspera.add(embarcacao);
    }

    public Embarcacao liberarProximaEmbarcacao() {
        return filaDeEspera.poll();
    }

    public boolean estaCheia(){
        return cheia;
    }

    public void alternarEstado(){
        cheia = !cheia;
    }

    public boolean filaVazia() {
        return filaDeEspera.isEmpty();
    }

    public Eclusa(){}

    public Eclusa(double comprimento, double largura){
        setComprimento(comprimento);
        setLargura(largura);
        filaDeEspera = new LinkedList<>();
        listaDeEmbarcacoes = new LinkedList<>();
    }
}