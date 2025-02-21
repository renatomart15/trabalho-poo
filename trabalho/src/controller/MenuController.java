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
        this.eclusa = new Eclusa(5);
        this.eclusaView = new EclusaView();
        this.menuView = new MenuView();
        this.eclusaController = new EclusaController(eclusa, eclusaView);
    }

    public void iniciarMenu() {
        while (true) {
            menuView.menuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1 -> menuEmbarcacao();
                case 2 -> System.out.println("Funcionalidade de carga ainda não implementada.");
                case 3 -> menuPessoa();
                case 4 -> menuEclusa();
                case 0 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private void menuEmbarcacao() {
        while (true) {
            menuView.menuEmbarcacao();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1 -> System.out.println("Cadastrando Navio Cargueiro...");
                case 2 -> System.out.println("Cadastrando Cruzeiro...");
                case 3 -> System.out.println("Cadastrando Lancha...");
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private void menuPessoa() {
        while (true) {
            menuView.menuPessoa();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1 -> System.out.println("Cadastrando Capitão...");
                case 2 -> System.out.println("Cadastrando Tripulante...");
                case 3 -> System.out.println("Cadastrando Passageiro...");
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private void menuEclusa() {
        while (true) {
            menuView.menuEclusa();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1 -> System.out.println("Cadastrando Eclusa...");
                case 2 -> eclusaController.operarEclusa();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
