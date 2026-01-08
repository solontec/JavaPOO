package AulaHeranca.model;

public class Jogador extends Pessoa {

    private String time;
    private String posicao;
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Jogador(String nome, int idade, String sexo, String posicao, String time) {
        super(nome, idade, sexo);
        this.setPosicao(posicao);
        this.setTime(time);
        this.setVelocidade(0);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void treinar(){
        this.setVelocidade(this.getVelocidade() + 1);
    }

    public void mostrarStatus(){
        super.mostrarStatus();
        System.out.println("nome:"+  this.getNome());
        System.out.println("Time do jogador:" + this.getTime());
        System.out.println("Posicao do jogador:" + this.getPosicao());
        System.out.println("Velocidade:" + this.getVelocidade());

    }
}
