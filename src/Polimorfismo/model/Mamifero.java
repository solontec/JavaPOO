package Polimorfismo.model;

public class Mamifero extends Animal{

    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.setCorPelo(corPelo);
    }
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover(){
        System.out.println("locomovendo");

    }

    @Override
    public void alimentar(){
        System.out.println("mamando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som");
    }


}
