package controller;

import model.Eclusa;
import model.Embarcacao;
import view.*;
import java.util.*;

public class EclusaController {
    Scanner scanner = new Scanner(System.in);
    private Eclusa eclusa;
    private EclusaView view;
    private MenuView menuView = new MenuView();

    public void adicionarEmbarcacaoNaFila(Embarcacao embarcacao){
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

    public Eclusa cadastrarEclusa(){
        double comprimento;
        double largura;
        MenuView menuView = new MenuView();

        menuView.mostrarMensagem("Comprimento: ");
        comprimento =  scanner.nextDouble();

        menuView.mostrarMensagem("Largura: ");
        largura =  scanner.nextDouble();

        eclusa = new Eclusa(comprimento, largura);

        return eclusa;
    }

    public EclusaController(Eclusa eclusa, EclusaView view) {
        this.eclusa = eclusa;
        this.view = view;
    }
}