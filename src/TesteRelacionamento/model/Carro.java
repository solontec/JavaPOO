package TesteRelacionamento.model;

import TesteRelacionamento.contract.Conducao;

public class Carro  implements Conducao {

    private String modelo;
    private String marca;
    private String cor;
    private boolean ligado;
    private boolean aberto;
    private Pessoa condutor;
    private boolean dentroDoCarro;
    private boolean entrarNoCarro;


    public Pessoa getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Pessoa passageiro) {
        this.passageiro = passageiro;
    }

    private Pessoa passageiro;

    public boolean isEntrarNoCarro() {
        return entrarNoCarro;
    }

    public void setEntrarNoCarro(boolean entrarNoCarro) {
        this.entrarNoCarro = entrarNoCarro;
    }
    
    public boolean isDentroDoCarro() {
        return dentroDoCarro;
    }

    public void setDentroDoCarro(boolean dentroDoCarro) {
        this.dentroDoCarro = dentroDoCarro;
    }



    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Carro(String modelo, String marca, String cor) {
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setCor(cor);
        this.setLigado(false);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getCondutor() {
        return condutor;
    }

    public void setCondutor(Pessoa condutor) {
        this.condutor = condutor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void abrirCarro(Pessoa p) {
        this.setAberto(true);
        this.setCondutor(p);

        System.out.println(p.getNome() + "abriu o carro" + this.getModelo());
    }

    @Override
    public void dirigir(Pessoa p) {
        if(this.isAberto()){
            throw new IllegalArgumentException("N pode dirigir com a porta aberta meu chapa");
        }

        if(!this.isLigado()){
            throw new IllegalArgumentException("N pode dirigir com o carro desligado ne");
        }

        if(!this.isDentroDoCarro()){
            throw new IllegalArgumentException("entra no carro pra dirigir ne");
        }

        this.setCondutor(p);
        System.out.println(p.getNome() + "Está dirigindo");

        System.out.println("Dirigindo");
    }

    @Override
    public void acelear(Pessoa p) {

    }

    @Override
    public void freiar(Pessoa p) {

    }

    public void ligarCarro(Pessoa p){
        this.setLigado(true);
    }

    public void fecharCarro(Pessoa p){
        this.setAberto(false);
    }

    public void entrarNoCarro(Pessoa p){

        this.setDentroDoCarro(true);
        this.setCondutor(p);
    }

    public void entrarPassageiro(Pessoa p2){
        this.setDentroDoCarro(true);
        this.setPassageiro(p2);
    }


    public void quemEstaNoCarro(){
        System.out.println(getPassageiro() + "" + getCondutor());
    }
}
