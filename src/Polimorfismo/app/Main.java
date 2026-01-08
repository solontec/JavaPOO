package Polimorfismo.app;

import Polimorfismo.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Cachorro> cachorro = new ArrayList<>();
        cachorro.add(new Cachorro(22, 1, 0, "azul"));
        cachorro.get(0).locomover();
        cachorro.get(0).reagir("toma comida");
        cachorro.get(0).reagir(11, 45);
        cachorro.get(0).reagir(false);
        cachorro.get(0).reagir(2, 12.5F);
        cachorro.get(0).reagir(17, 4.5F);



    }
}
