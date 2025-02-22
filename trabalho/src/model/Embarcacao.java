package model;

public class Embarcacao {
    private String nome;
    private double comprimento;
    private double largura;
    private double carga;
    private double cargaMaxima;
    private String portoOrigem;
    private String portoDestino;
    private String pais;
    private int id; 
    private Capitao capitao;
    private String sentido;

    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setComprimento(double comprimento){
        if(comprimento > 0){
            this.comprimento = comprimento;
        }
    } 

    public double getComprimento(){
        return comprimento;
    }

    public void setLargura(double largura){
        if(largura > 0){
            this.largura = largura;
        }
    } 

    public double getLargura(){
        return largura;
    }

    public void setCarga(double carga){
        if(carga > 0){
            this.carga = carga;
        }
    }

    public double getCarga(){
        return carga;
    }

    public void adicionarCarga(double carga){
        setCarga(getCarga() + carga);
    }

    public void setCargaMaxima(double cargaMaxima){
        if(cargaMaxima > 0){
            this.cargaMaxima = cargaMaxima;
        }
    }

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
        if(id > 0){
            this.id = id;
        }
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

    public String toString(){
        return "Dimensoes da embarcacao: " + getComprimento() + "x" + getLargura() +
        "\nCarga: " + getCarga() + "/" + getCargaMaxima() +
        "\nPorto de Origem: " + getPortoOrigem() +
        "\nPorto de Destino: " + getPortoDestino() + 
        "\nPais: " + getPais() +
        "\nID: " + getId() +
        "\nCapitao: " + capitao.getNome() +
        "Sentido: " + getSentido();
    }

    public Embarcacao(){}

    public Embarcacao(String nome, double comprimento, double largura, double cargaMaxima, String portoOrigem, String portoDestino, String pais, int id, Capitao capitao, String sentido){
        setNome(nome);
        setComprimento(comprimento);
        setLargura(largura);
        setCargaMaxima(cargaMaxima);
        setPortoOrigem(portoOrigem);
        setPortoDestino(portoDestino);
        setPais(pais);
        setId(id);
        setCapitao(capitao);
        setSentido(sentido);
    }
}   

