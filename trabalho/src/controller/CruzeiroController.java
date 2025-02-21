package controller;

import model.*;
import view.*;
import java.util.*;

public class CruzeiroController{
    private Scanner scanner;
    private EclusaController eclusaController;
    private Eclusa eclusa;
    private EclusaView eclusaView;
    private MenuView menuView;

    public void cadastrarCruzeiro(){
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

        menuView.mostrarMensagem("Nome: ");
        nome = scanner.nextLine();

        menuView.mostrarMensagem("Comprimento: ");
        comprimento = scanner.nextDouble();
        
        menuView.mostrarMensagem("Largura: ");
        largura = scanner.nextDouble();

        menuView.mostrarMensagem("Porto de Origem: ");
        portoOrigem = scanner.nextLine();

        menuView.mostrarMensagem("Porto de Destino: ");
        portoDestino = scanner.nextLine();

        menuView.mostrarMensagem("País: ");
        pais = scanner.nextLine();

        menuView.mostrarMensagem("ID: ");
        id = scanner.nextInt();

        menuView.mostrarMensagem("Nome do Capitao: ");
        capitao.setNome(scanner.nextLine());

        capitao.setNomeNavio(nome);

        menuView.mostrarMensagem("Sentido: ");
        sentido = scanner.nextLine();

        eclusaController.adicionarEmbarcacao(new NavioCargueiro(nome, comprimento, largura, portoOrigem, portoDestino, pais, id, capitao, sentido));
    }
}