package Aula07RelacionamentoDeClasses.app;

import Aula07RelacionamentoDeClasses.model.Luta;
import Aula07RelacionamentoDeClasses.model.Lutador;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // HERE I USE ARRAYS
        List<Lutador> lutador = new ArrayList<>();

        lutador.add( new Lutador("Guizin", "brasil", 19, 72.5F, 1.80F, "muie"));
        lutador.add( new Lutador("Guizi", "brasil", 19, 72.5F, 1.80F, "muie"));

        lutador.remove(0);

        for(Lutador l: lutador){
            System.out.println(l.getName());
        }










    }
}