package AulaHeranca.model;

public class Visitante extends Pessoa {
    public Visitante(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.fazerAniversario();
    }

    @Override
    public void mostrarStatus(){
        System.out.println(this.getIdade());

    }

}
