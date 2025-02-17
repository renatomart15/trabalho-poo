package model;

public class Funcionario extends Pessoa {
    private String funcao;
    private double salario;

    public void setFuncao(String funcao){
        if(funcao != null){
            this.funcao = funcao;
        }
    }

    public String getFuncao(){
        return funcao;
    }

    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }
    }

    public double getSalario(){
        return salario;
    }
}
