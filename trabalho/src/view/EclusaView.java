package view;

import model.Embarcacao;

public class EclusaView{
    public void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }

    public void mostrarEstadoEclusa(boolean cheia){
        if(cheia == true){
            System.out.println("A Eclusa está no nivel do mar");
        }
        else{
            System.out.println("A Eclusa está no nivel do rio");
        }
    }

    public void mostrarEmbarcacaoPassando(){
        System.out.println("A embarcacao passou para o outro lado!");
    }
}