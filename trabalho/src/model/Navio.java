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

    //COMPRIMENTO
    public abstract void setComprimento(double comprimento); 

    public double getComprimento(){
        return comprimento;
    }

    //LARGURA
    public abstract void setLargura(double largura); 

    public double getLargura(){
        return largura;
    }

    //CARGA MAXIMA
    public abstract void setCargaMaxima(double cargaMaxima); 

    public double getCargaMaxima(){
        return cargaMaxima;
    }

    //PORTO ORIGEM 
    public void setPortoOrigem(String portoOrigem){
        if(portoOrigem != null){
            this.portoOrigem = portoOrigem;
        }
    }

    public String getPortoOrigem(){
        return portoOrigem;
    }

    //PORTO DESTINO
    public void setPortoDestino(String portoDestino){
        if(portoDestino != null){
            this.portoDestino = portoDestino;
        }
    }

    public String getPortoDestino(){
        return portoDestino;
    }

    //PAIS
    public void setPais(String pais){
        if(pais != null){
            this.pais = pais;
        }
    }

    public String getPais(){
        return pais;
    }

    //ID
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    //CAPITAO
    public void setCapitao(Capitao capitao){
        if(capitao != null){
            this.capitao = capitao;
        }
    }

    public Capitao getCapitao(){
        return capitao;
    }

    //SENTIDO
    public void setSentido(String sentido){
        if(sentido != null && (sentido == "rio_mar" || sentido == "mar_rio")){
            this.sentido = sentido;
        }
    }

    public String getSentido(){
        return sentido;
    }
}   

