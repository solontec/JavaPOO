package AulaHeranca.model;

public class Aluno extends Pessoa{

    private int numeroMatricula;
    private String curso;


    public Aluno(String nome, int idade, String sexo, String curso){
        super(nome, idade, sexo);
        this.curso = curso;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula(){

    }

    public void pagarMensalidade(){

    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("Curso:" + this.getCurso());
    }
}