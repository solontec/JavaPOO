package ProjetoFinal.model;

import ProjetoFinal.contract.Visivel;
import com.sun.security.jgss.GSSUtil;

public class Visualizacao implements Visivel {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        espectador.assistirMaisUm();
        filme.maisUmaView();
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public void verStatus() {
        System.out.println("Espectador" + getEspectador().getNome() + "vendo o video" + getFilme().getTitulo() );
    }
}
