package ProjetoFinal.model;

import ProjetoFinal.contract.Visivel;

public class Gafanhoto extends Pessoa implements Visivel {

    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotalAssistido(0);
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void assistirMaisUm(){
        this.setTotalAssistido(getTotalAssistido() + 1);
    }



    @Override
    public void verStatus() {
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getSexo());
        System.out.println(getLogin());
        System.out.println(getTotalAssistido());
    }
}
