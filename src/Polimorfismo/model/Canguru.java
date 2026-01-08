package Polimorfismo.model;

public class Canguru extends Mamifero{
    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }


    @Override
    public void locomover(){
        System.out.println("Pulando pra caralho");
    }

    @Override
    public void alimentar(){
        System.out.println("canguru mama");
    }


}
