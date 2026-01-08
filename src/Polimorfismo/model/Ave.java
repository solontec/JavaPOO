package Polimorfismo.model;

public class Ave extends Animal{

    private String corPena;
    public Ave(float peso, int idade, int membros, String corPena){
        super(peso, idade, membros);
        this.setCorPena(corPena);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho(){
        System.out.println("fazendo ninho de ave");
    }
    @Override
    public void locomover(){
        System.out.println("voando");

    }

    @Override

    public void alimentar(){
        System.out.println("comendo eduardo");
    }

    @Override

    public void emitirSom(){
        System.out.println("sommmm");
    }

}
