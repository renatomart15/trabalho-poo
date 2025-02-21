package view;

public class MenuView {
    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem + "\n");
    }

    public void menuPrincipal(){
        System.out.println("\n===== Menu do Sistema =====");
        System.out.println("\n 1. Cadastrar Embarcacao");
        System.out.println(" 2. Cadastrar Carga");
        System.out.println(" 3. Cadastrar Pessoa");
        System.out.println(" 4. Gerenciar Eclusa");
        System.out.println(" 0. Sair\n");
    }

    public void menuEmbarcacao(){
        System.out.println("\n===== Menu de Embarcacao =====");
        System.out.println("\n 1. Cadastrar NavioCargueiro");
        System.out.println(" 2. Cadastrar Cruzeiro");
        System.out.println(" 3. Cadastrar Lancha");
        System.out.println(" 0. Voltar\n");
    }

    public void menuPessoa(){
        System.out.println("\n===== Menu de Pessoa =====");
        System.out.println("\n 1. Cadastrar Capitao");
        System.out.println(" 2. Cadastrar Tripulante");
        System.out.println(" 3. Cadastrar Passageiro");
        System.out.println(" 0. Voltar\n");
    }

    public void menuEclusa(){
        System.out.println("\n===== Menu da Eclusa =====");
        System.out.println("\n 1. Cadastrar Eclusa");
        System.out.println(" 2. Operar Eclusa");
        System.out.println(" 0. Voltar\n");
    }
}