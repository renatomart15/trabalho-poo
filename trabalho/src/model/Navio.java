package model;

public abstract class Navio {
    private double comprimento;
    private double largura;
    private double cargaMaxima;
    private String portoOrigem;
    private String portoDestino;
    private String pais;
    private int id; 
    private Capitao capitao;
    private String sentido;

    public abstract void setComprimento(double comprimento); 

    public double getComprimento(){
        return comprimento;
    }

    public abstract void setLargura(double largura); 

    public double getLargura(){
        return largura;
    }

    //public abstract void setCargaMaxima(); 

    public double getCargaMaxima(){
        return cargaMaxima;
    }

    public void setPortoOrigem(String portoOrigem){
        if(portoOrigem != null){
            this.portoOrigem = portoOrigem;
        }
    }

    public String getPortoOrigem(){
        return portoOrigem;
    }

    public void setPortoDestino(String portoDestino){
        if(portoDestino != null){
            this.portoDestino = portoDestino;
        }
    }

    public String getPortoDestino(){
        return portoDestino;
    }

    public void setPais(String pais){
        if(pais != null){
            this.pais = pais;
        }
    }

    public String getPais(){
        return pais;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setCapitao(Capitao capitao){
        if(capitao != null){
            this.capitao = capitao;
        }
    }

    public Capitao getCapitao(){
        return capitao;
    }

    public void setSentido(String sentido){
        if(sentido != null && (sentido == "rio_mar" || sentido == "mar_rio")){
            this.sentido = sentido;
        }
    }

    public String getSentido(){
        return sentido;
    }
}   

