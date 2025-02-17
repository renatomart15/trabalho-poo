package model;

public class NavioCargueiro extends Navio {
    private int quantAtualConteiners;
    private int quantMaxConteiners;
    ArrayList<Conteiner> conteiners = new ArrayList();

    public int getQuantAtualConteiners(){
        return quantAtualConteiners;
    }

    public void setQuantMaxConteiners(int quantMaxConteiners){
        if(quantMaxConteiners > 0){
            this.quantMaxConteiners = quantMaxConteiners;
        }
    }

    public int getQuantMaxConteiners(){
        return quantMaxConteiners;
    }

    public void addConteiner(Conteiner conteiner){
        if((getCargaAtual() + conteiner.getCarga() <= getCargaMaxima()) && quantAtualConteiners + 1 <= quantMaxConteiners){
            conteiners.add(conteiner);
            quantAtualConteiners++;
            cargaAtual += conteiner.getCarga();
        }
    }
}
