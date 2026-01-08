package AulaHeranca.model;

public class Bolsista extends Aluno {
    private int bolsa;

    public Bolsista(String nome, int idade, String sexo, String curso){
        super(nome, idade, sexo, curso);
    }

    public void renovarBolsa(){

    }


    @Override
    public void pagarMensalidade(){

    }

}
