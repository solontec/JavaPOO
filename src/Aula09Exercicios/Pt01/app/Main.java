package Aula09Exercicios.Pt01.app;

import Aula09Exercicios.Pt01.model.Livro;
import Aula09Exercicios.Pt01.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa[] = new Pessoa[4];
        pessoa[0] = new Pessoa("gui", 22, "Masculino");
        pessoa[1] = new Pessoa("livia", 18, "Feminino");
        pessoa[2] = new Pessoa("edu", 28, "Masculino");
        pessoa[3] = new Pessoa("vitoria", 59, "Feminino");

        Livro livro[] = new Livro[4];
        livro[0] = new Livro("HP", 498, "j.k", "teste");
        livro[1] = new Livro("HPPPP", 498, "j.kkkk", "O Sr. e a Sra. Dursley, da Rua dos Alfeneiros, nº. 4, se orgulhavam de\n" +
                "dizer que eram perfeitamente normais, muito bem, obrigado. Eram as últimas\n" +
                "pessoas no mundo que se esperaria que se metessem em alguma coisa estranha\n" +
                "ou misteriosa, porque simplesmente não compactuavam com esse tipo de\n" +
                "bobagem.\n" +
                "O Sr. Dursley era Diretor de uma firma chamada Grunnings,\n" +
                "fazia perfurações. Era um homem alto e corpulento quase sem pescoço, embora\n" +
                "tivesse enormes bigodes. A Sra. Dursley era loura e tinha um pescoço quase duas\n" +
                "vezes mais comprido que o normal o que era muito útil porque ela passava grande\n" +
                "parte do tempo espichando-o por cima da cerca do jardim para espiar os vizinhos.\n" +
                "Os Dursley tinham um filhinho chamado Dudley, o Duda, e em sua opinião não\n" +
                "havia garoto melhor em nenhum lugar do mundo.\n" +
                "Os Dursley tinham tudo que queriam, mas tinham também um segredo, e\n" +
                "seu maior receio era que alguém o descobrisse. Achavam que não iriam agüentar\n" +
                "se alguém descobrisse a existência dos Potter.\n" +
                "A Sra. Potter era irmã da Sra. Dursley, mas não se viam há muitos anos,\n" +
                "na realidade a Sra. Dursley fingia que não tinha irmã, porque esta e o marido");

        livro[2] = new Livro("Need for speed", 302, "j.k", "carrrooooooooo");
        livro[3] = new Livro("senhor do aneis", 49, "j.k", "anel");


        livro[1].abrir(pessoa[0]);
        livro[1].folhear(238);
        livro[1].avancarPagina();

        livro[1].detalhes();



    }
}
