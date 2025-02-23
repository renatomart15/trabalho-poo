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

    public CruzeiroController(Eclusa eclusa){
        this.scanner = new Scanner(System.in);
        this.eclusa = eclusa;
        this.eclusaView = new EclusaView();
        this.menuView = new MenuView();
        this.eclusaController = new EclusaController(eclusa, eclusaView);
    }

    public Embarcacao cadastrarCruzeiro(){
        String nome;
        double comprimento;
        double largura;
        double carga;
        double cargaMaxima;
        String portoOrigem;
        String portoDestino;
        String pais;
        int id; 
        Capitao capitao = new Capitao();
        String sentido;
        int quantMaxPassageiros;

        int quantMaxConteiners;
        ArrayList<Conteiner> conteiners = new ArrayList();

        int quantMaxTripulantes;

        menuView.mostrarMensagem("Nome: ");
        nome = scanner.nextLine();

        menuView.mostrarMensagem("Comprimento: ");
        comprimento = scanner.nextDouble();
        
        menuView.mostrarMensagem("Largura: ");
        largura = scanner.nextDouble();

        menuView.mostrarMensagem("Carga Maxima: ");
        cargaMaxima = scanner.nextDouble();

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

        menuView.mostrarMensagem("Quantidade max. de passageiros: ");
        quantMaxPassageiros = scanner.nextInt();

        Embarcacao embarcacao = new Embarcacao(nome, comprimento, largura, cargaMaxima, portoOrigem, portoDestino, pais, id, capitao, sentido);

        return embarcacao;
    }
}