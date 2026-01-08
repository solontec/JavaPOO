package TesteRelacionamento.app;

import TesteRelacionamento.model.Carro;
import TesteRelacionamento.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa[] = new Pessoa[2];
        pessoa[0] = new Pessoa("Guizin pinto duro");
        pessoa[1] = new Pessoa("dudu pinto duro");

        Carro carro[] = new Carro[2];
        carro[0] = new Carro("BMW 320i", "BMW", "Blue");

        carro[0].abrirCarro(pessoa[0]);
        carro[0].entrarNoCarro(pessoa[0]);
        carro[0].entrarPassageiro(pessoa[1]);
        carro[0].fecharCarro(pessoa[0]);


        carro[0].ligarCarro(pessoa[0]);
        carro[0].dirigir(pessoa[0]);
        carro[0].quemEstaNoCarro();


    }
}
