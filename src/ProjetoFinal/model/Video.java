package ProjetoFinal.model;

import ProjetoFinal.contract.AcoesVideo;
import ProjetoFinal.contract.Visivel;


public class Video implements AcoesVideo, Visivel {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(0);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int  getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void avaliar(int avaliacao){
        this.setAvaliacao(avaliacao);
    }

    public int getViews() {
        return views;
    }

    public void maisUmaView(){
        this.setViews(getViews() + 1);
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    @Override
    public void play() {
        if(isReproduzindo() == true){
            throw new IllegalArgumentException("Não pode dar play pq já ta rodando");
        }
        System.out.println("PLAY NO VIDEO");
        this.setReproduzindo(true);

    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Video pausado");
    }

    @Override
    public void like() {
        this.setCurtidas(getCurtidas() + 1);
    }

    @Override
    public void verStatus(){
        System.out.println("titulo do video" + getTitulo());
        System.out.println("seu video tem" + getViews()+ "visualizações");
        System.out.println("seu video tem" + getAvaliacao()+ "avaliações");
        System.out.println("seu está reproduzindo" + isReproduzindo());
        System.out.println("seu video tem" + getCurtidas()+ "curtidas");
    }
    }
