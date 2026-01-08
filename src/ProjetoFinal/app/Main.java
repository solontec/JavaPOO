package ProjetoFinal.app;

import ProjetoFinal.model.Gafanhoto;
import ProjetoFinal.model.Video;
import ProjetoFinal.model.Visualizacao;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Video> videos = new ArrayList<>();
        List<Gafanhoto> gafanhoto = new ArrayList<>();
        List<Visualizacao> v = new ArrayList<>();

        videos.add(new Video("Arrancando dente GARAI"));
        gafanhoto.add(new Gafanhoto("Guilherme", 18, "Masculino", "guisolon"));
        v.add(new Visualizacao(gafanhoto.get(0), videos.get(0)));

        videos.get(0).play();
        videos.get(0).like();
        videos.get(0).avaliar(4);

        gafanhoto.get(0).verStatus();






    }
}
