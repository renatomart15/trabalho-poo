package controller;

import model.Eclusa;
import model.Embarcacao;
import view.EclusaView;

public class EclusaController {
    private Eclusa eclusa;
    private EclusaView view;

    public void adicionarEmbarcacao(Embarcacao embarcacao){
        eclusa.adicionarEmbarcacaoNaFila(embarcacao);
        view.mostrarMensagem("Embarcacao " + embarcacao.getNome() + " adicionada na fila.");
    }

    public void operarEclusa(){
        if (eclusa.filaVazia()) {
            view.mostrarMensagem("Nenhuma embarcação aguardando na fila.");
        }
        else{   
            Embarcacao embarcacao = eclusa.liberarProximaEmbarcacao();
            view.mostrarMensagem("Operando a eclusa para embarcação: " + embarcacao.getNome());
            eclusa.alternarEstado();
            view.mostrarEstadoEclusa(eclusa.estaCheia());
            view.mostrarMensagem("Embarcação " + embarcacao.getNome() + " passou para o outro lado.");
        }
    }

    public EclusaController(Eclusa eclusa, EclusaView view) {
        this.eclusa = eclusa;
        this.view = view;
    }
}