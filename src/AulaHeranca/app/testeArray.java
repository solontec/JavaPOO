package AulaHeranca.app;

import java.util.ArrayList;
import java.util.List;

public class testeArray {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // adiciando dados no array

        nomes.add("tutum s");
        nomes.add("tutum sahur");
        nomes.add("tutum sahur");

        nomes.get(0);


        for(String nome: nomes){
            System.out.println();
        }
    }
}
