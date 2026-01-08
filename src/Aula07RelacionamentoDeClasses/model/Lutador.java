package Aula07RelacionamentoDeClasses.model;

import Aula07RelacionamentoDeClasses.contract.Combatente;

public class Lutador implements Combatente {

    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int victories;
    private int defeats;
    private int draw;
    private int power;
    private String sexo;


    public Lutador(String name, String nationality, int age, float weight, float height, String sexo ) {
        this.setName(name);
        this.setNationality(nationality);
        this.setAge(age);
        this.setWeight(weight);
        this.setHeight(height);
        this.setSexo(sexo);
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight(){
        return weight;

    }

    private void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {


        if(this.getWeight() < 52.2){
            throw new IllegalArgumentException("invalid");
        } else if(this.getWeight() <= 70.3){
            this.category =  "leve";
        } else if(this.getWeight() <= 83.9){
            this.category = "Médio";
        } else if(this.getWeight() <= 120.2){
            this.category = "Pesado";
        } else{
            this.category = "n tem";
        }

    }
    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    // methods for "Combatente"
    @Override
    public void present() {
        System.out.println("THE TIME HAS COME OF APRESENT!");
        System.out.println("--------------");
        System.out.println("--------------");

        System.out.println("Name: " + this.getName());
        System.out.println("Nationality: " + this.getNationality());
        System.out.println("Age: " + this.getAge());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Category: " + this.getCategory());

        System.out.println("--------------");
        System.out.println("--------------");
    }

    @Override
    public void status() {
        System.out.println("Vitórias " + this.getVictories());
        System.out.println("Derrotas " + this.getDefeats());
        System.out.println("Empates " + this.getDraw());
    }
    @Override
    public void winFight() {
        System.out.println("Win the fight!" );
        this.setVictories(this.getVictories() + 1);
    }
    @Override

    public void loseFight() {
        this.setDefeats(this.getDefeats() + 1);
    }
    @Override

    public void drawFight() {
        this.setDraw(this.getDraw() + 1);
    }
}
