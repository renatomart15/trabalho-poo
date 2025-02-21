package view;

public class MenuView {
    public void menuPrincipal(){
        System.out.println("===== Menu do Sistema =====");
        System.out.println("\n 1. Cadastrar Embarcacao");
        System.out.println(" 2. Cadastrar Carga");
        System.out.println(" 3. Cadastrar Pessoa");
        System.out.println(" 4. Gerenciar Eclusa");
        System.out.println(" 0. Sair");
    }

    public void menuEmbarcacao(){
        System.out.println("===== Menu de Embarcacao =====");
        System.out.println("\n 1. Cadastrar NavioCargueiro");
        System.out.println("\n 2. Cadastrar Cruzeiro");
        System.out.println("\n 3. Cadastrar Lancha");
        System.out.println(" 0. Voltar");
    }

    public void menuPessoa(){
        System.out.println("===== Menu de Pessoa =====");
        System.out.println("\n 1. Cadastrar Capitao");
        System.out.println("\n 2. Cadastrar Tripulante");
        System.out.println("\n 3. Cadastrar Passageiro");
        System.out.println(" 0. Voltar");
    }

    public void menuPessoa(){
        System.out.println("===== Menu da Eclusa =====");
        System.out.println("\n 1. Cadastrar Eclusa");
        System.out.println("\n 2. Operar Eclusa");
        System.out.println(" 0. Voltar");
    }
}