package controller;

import model.*;
import view.*;
import java.util.Scanner;

public class NavioCargueiroController{
    private Scanner scanner;
    private EclusaController eclusaController;
    private Eclusa eclusa;
    private EclusaView eclusaView;
    private MenuView menuView;

    public void cadastrarNavioCargueiro(){
        String nome;
        double comprimento;
        double largura;
        double carga;
        double cargaMaxima;
        String portoOrigem;
        String portoDestino;
        String pais;
        int id; 
        Capitao capitao;
        String sentido;

        int quantMaxConteiners;
        ArrayList<Conteiner> conteiners = new ArrayList();

        int quantMaxTripulantes;
        ArrayList<Tripulante> tripulacao = new ArrayList();

        menuView.mostrarMensagem("Nome: ");
        nome = scanner.nextLine();

        menuView.mostrarMensagem("Comprimento: ");
        comprimento = scanner.nextDouble();
        
        menuView.mostrarMensagem("Largura: ");
        largura = scanner.nextDouble();

        menuView.mostrarMensagem("Porto de Origem: ");
        portoOrigem = scanner.nextLine();

        menuView.mostrarMensagem("Porto de Destino: ");
        nomeDestino = scanner.nextLine();

        menuView.mostrarMensagem("País: ");
        pais = scanner.nextLine();

        menuView.mostrarMensagem("ID: ");
        id = scanner.nextInt();

        
    }
}