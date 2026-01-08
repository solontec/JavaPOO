package Aula09Exercicios.Pt01.contract;

import Aula09Exercicios.Pt01.model.Livro;
import Aula09Exercicios.Pt01.model.Pessoa;

public interface Publicacao {
    //methods
    void abrir(Pessoa l1);
    void fechar();
    void folhear(int p);
    void avancarPagina();
    void voltarPagina();
}
