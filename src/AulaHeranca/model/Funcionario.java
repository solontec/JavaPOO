package AulaHeranca.model;

import AulaHeranca.contract.Trabalhador;

public class Funcionario extends Pessoa implements Trabalhador {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){

    }

    @Override
    public void trabalhar(){

    }
}
