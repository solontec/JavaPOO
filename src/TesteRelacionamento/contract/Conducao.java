package TesteRelacionamento.contract;

import TesteRelacionamento.model.Pessoa;

public interface Conducao {


    void abrirCarro(Pessoa p);

    void dirigir(Pessoa p);
    void acelear(Pessoa p);
    void freiar(Pessoa p);
}
