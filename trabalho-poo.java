public class TamanhoNavio {
    private double comprimento;
    private double largura;
}

public class TamanhoEclusa extends TamanhoNavio{
    private double altura;
}


public class Navio {
    private TamanhoNavio tamanhoNavio;
    private double cargaMaxima;
    private String portoOrigem;
    private String portoDestino;
    private String pais;
    private int id;
    private Capitao capitao;
    private String sentido;



    public void setPais(String pais){
        if(pais != null){
            this.pais = pais;
        }
    }

    public String getPais(){
        return pais;
    }

    public void setPortoDestino(String portoDestino){
        if(portoDestino != null){
            this.portoDestino = portoDestino;
        }
    }

    public String getDestino(){
        return portoDestino;
    }

    public void setPortoOrigem(String portoOrigem){
        if(portoOrigem != null){
            this.portoOrigem = portoOrigem;
        }
    }

    public String getOrigem(){
        return portoOrigem;
    }

}

public class Conteiner{
    private double carga; // ate 2 toneladas


    public void setCarga(double carga){
        if(carga > 0 && carga <=2){
            this.carga = carga;
        }

    }

}

public class NavioCargueiro extends Navio{

    private Conteiner [] conteiners;

    public NavioCargueiro(){
        //cargaMaxima = 20;
        //conteiners = new Conteiner[10];

    }

    public NavioCargueiro(double cargaMaxima,  String pais, String portoOrigem, String portoDestino, String sentido, Capitao capitao, TamanhoNavio tamanhoNavio, int id){


    }
}

public class Pessoa{
    private int cpf;
    private String nome;
}

public class Capitao extends Pessoa {
    private int idNavio;
}


public class Eclusa {
    //add nivel mar e nivel do rio
    private TamanhoEclusa tamanhoEclusa;
    private double capacidadeMaxima;
    private double capacidadeMinima;
    private double vazao;
    private double preco; // tipo embarcação


}