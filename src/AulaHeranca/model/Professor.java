package AulaHeranca.model;

import AulaHeranca.contract.Trabalhador;

public final class Professor extends Funcionario implements Trabalhador {

    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, float salario) {
        super(nome, idade, sexo);
        this.setSalario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAumento(){

    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("Curso:" + this.getSalario());
    }


}
