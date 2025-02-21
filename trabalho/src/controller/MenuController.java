package controller;

import model.*;
import view.*;
import java.util.Scanner;

public class MenuController {
    private Scanner scanner;
    private EclusaController eclusaController;
    private Eclusa eclusa;
    private EclusaView eclusaView;
    private MenuView menuView;

    public MenuController() {
        this.scanner = new Scanner(System.in);
        this.eclusa = new Eclusa();
        this.eclusaView = new EclusaView();
        this.menuView = new MenuView();
        this.eclusaController = new EclusaController(eclusa, eclusaView);
    }

    public void iniciarMenu() {
        while (true) {
            menuView.menuPrincipal();
            menuView.mostrarMensagem("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            }
            
            switch (opcao) {
                case 1 -> menuEmbarcacao();
                case 2 -> menuView.mostrarMensagem("Funcionalidade de carga ainda não implementada.");
                case 3 -> menuPessoa();
                case 4 -> menuEclusa();
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
            menuView.mostrarMensagem("\nEsolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            }
            
            switch (opcao) {
                case 1 -> menuView.mostrarMensagem("Cadastrando Navio Cargueiro...");
                case 2 -> menuView.mostrarMensagem("Cadastrando Cruzeiro...");
                case 3 -> menuView.mostrarMensagem("Cadastrando Lancha...");
                case 0 -> {
                    return;
                } 
            }
        }
    }

    private void menuPessoa() {
        while (true) {
            menuView.menuPessoa();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            }
            
            switch (opcao) {
                case 1 -> menuView.mostrarMensagem("Cadastrando Capitão...");
                case 2 -> menuView.mostrarMensagem("Cadastrando Tripulante...");
                case 3 -> menuView.mostrarMensagem("Cadastrando Passageiro...");
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
            scanner.nextLine();

            while(opcao != 1 && opcao != 2 && opcao != 0){
                menuView.mostrarMensagem("Opção inválida");
                menuView.mostrarMensagem("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            }
            
            switch (opcao) {
                case 1 -> menuView.mostrarMensagem("Cadastrando Eclusa...");
                case 2 -> eclusaController.operarEclusa();
                case 0 -> {
                    return;
                } 
            }
        }
    }
}
