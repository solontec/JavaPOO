package Aula09Exercicios.Pt01.model;

import Aula09Exercicios.Pt01.contract.Publicacao;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private String conteudo;
    private Pessoa leitor;

    public Livro(String titulo, int totalPaginas, String autor, String conteudo) {
        this.setTitulo(titulo);
        this.setTotalPaginas(totalPaginas);
        this.setAutor(autor);
        this.setAberto(false);
        this.setConteudo(conteudo);
        this.setPaginaAtual(0);
    }

    private void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    private String getConteudo(){
        return conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //methods
    @Override
    public void abrir(Pessoa l1) {
        if(!this.isAberto()){
            this.setAberto(true);
            this.setLeitor(l1);
            System.out.println(l1.getNome() + " abriu o livro "  + this.getTitulo() );

        } else{
            throw new IllegalArgumentException("Já está aberto");
        }

    }
    public void lerLivro(){
        if(this.isAberto()){
            System.out.println(getConteudo());
        }
    }
    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
            System.out.println("Fechei o livro");
        } else{
            throw new IllegalArgumentException("Já está fechado");
        }

    }
    @Override
    public void folhear(int p) {
        if(p > getTotalPaginas()){
            this.setPaginaAtual(0);
            throw new IllegalArgumentException("N da pra folhear isso pq nem existe esse numero de pagina");
        } else{
            this.setPaginaAtual(p);
        }
    }
    @Override
    public void avancarPagina() {
        this.setPaginaAtual(getPaginaAtual() + 1);
        System.out.println("Você está na página" + getPaginaAtual());
    }

    @Override
    public void voltarPagina() {
        this.setPaginaAtual(getPaginaAtual() - 1);
        System.out.println("Você está na pagina" + getPaginaAtual());
    }

    public void detalhes(){
        System.out.println(getTitulo());
        System.out.println(getAutor());
        System.out.println(getTotalPaginas());
        System.out.println("você está na pagina " + getPaginaAtual());
    }


}

