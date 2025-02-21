package model;

public class Conteiner {
    private int idConteiner;
    private double carga; 

    public void setIdConteiner(int idConteiner){
        if(idConteiner > 0){
            this.idConteiner = idConteiner;
        }
    }

    public int getIdConteiner(){
        return idConteiner;
    }

    public void setCarga(double carga){
        if(carga >= 0 && carga <= 2){
            this.carga = carga;
        }
    }

    public double getCarga(){
        return carga;
    }

    public Conteiner(){}

    public Conteiner(double carga, int idConteiner){
        setCarga(carga);
        setIdConteiner(idConteiner);
    }
}
