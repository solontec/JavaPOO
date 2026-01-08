package Polimorfismo.model;

public class Cachorro extends Mamifero{
    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    // todas as assinaturas são diferentes!!!

    public void reagir(String frase){
        if(frase.equals("toma comida") || frase.equals("Oii")){
            System.out.println("Abanar e latir");
        } else{
            System.out.println("Rosnando");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        } else if (hora >=18) {
            System.out.println("ignora");
        } else{
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        } else{
            System.out.println("Rosnar e latir");
        }


    }

    public void reagir(int idade, float peso){
        if(idade < 5 ){
            if(peso < 10){
                System.out.println("abanar");
            } else{
                System.out.println("latir");
            }

            } else{
            if(peso < 10){
                System.out.println("Rosnar");
            } else{
                System.out.println("ignorar apenas");
            }
        }
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }

    @Override
    public void locomover(){
        System.out.println("Cachorro correndo");
    }



}
