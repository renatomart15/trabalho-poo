package controller;

import model.*;
import view.*;
import java.util.Scanner;
import controller.*;

public class MenuController {
    private Scanner scanner;
    private Eclusa eclusa;
    private EclusaView eclusaView = new EclusaView();
    private MenuView menuView = new MenuView();
    private EclusaController eclusaController;
    
    private NavioCargueiroController navioCargueiroController;
    private LanchaController lanchaController;
    private CruzeiroController cruzeiroController;
    private ConteinerController conteinerController;

    public MenuController(Eclusa eclusa) {
        this.scanner = new Scanner(System.in);
        this.eclusa = eclusa;
        this.eclusaView = new EclusaView();
        this.menuView = new MenuView();
        this.eclusaController = new EclusaController(eclusa, eclusaView);

        this.navioCargueiroController =  new NavioCargueiroController(eclusa);
        this.lanchaController = new LanchaController(eclusa);
        this.cruzeiroController =  new CruzeiroController(eclusa);
        this.conteinerController = new ConteinerController();
    }

    public void iniciarMenu() {
        while (true) {
            menuView.menuPrincipal();
            menuView.mostrarMensagem("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
            }
            
            switch (opcao) {
                case 1 -> menuEmbarcacao();
                case 2 -> menuConteiner();
                case 3 -> menuEclusa();
                case 0 -> {
                    menuView.mostrarMensagem("Saindo...");
                    return;
                }
            }
        }
    }

    private void menuEmbarcacao() {
        while (true) {
            menuView.menuEmbarcacao();
            menuView.mostrarMensagem("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
            }
            
            switch (opcao) {
                case 1 -> eclusaController.adicionarEmbarcacaoNaFila(navioCargueiroController.cadastrarNavioCargueiro());
                case 2 -> eclusaController.adicionarEmbarcacaoNaFila(cruzeiroController.cadastrarCruzeiro());
                case 3 -> eclusaController.adicionarEmbarcacaoNaFila(lanchaController.cadastrarLancha());
                case 4 -> menuView.mostrarMensagem("Listanto Embarcações...");
                case 0 -> {
                    return;
                } 
            }
        }
    }

    private void menuConteiner() {
        while (true) {
            menuView.menuConteiner();
            menuView.mostrarMensagem("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
            }
            
            switch (opcao) {
                case 0 -> {
                    return;
                } 
            }
        }
    }

    private void menuEclusa() {
        while (true) {
            menuView.menuEclusa();
            int opcao = scanner.nextInt();

            while(opcao != 1 && opcao != 2 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
            }
            
            switch (opcao) {
                case 1 -> eclusa = eclusaController.cadastrarEclusa();
                case 2 -> eclusaController.operarEclusa();
                case 0 -> {
                    return;
                } 
            }
        }
    }
}
