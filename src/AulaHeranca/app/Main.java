package AulaHeranca.app;

import AulaHeranca.model.Aluno;
import AulaHeranca.model.Jogador;
import AulaHeranca.model.Professor;
import AulaHeranca.model.Visitante;

import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {

        List<Aluno> aluno = new ArrayList<>();
        aluno.add( new Aluno("Guizin", 19, "Feminino", "T.I"));
        aluno.add(new Aluno("tutum sahur", 10, "masculino", "ti"));

        List<Professor> professor = new ArrayList<>();
        professor.add( new Professor("Eder", 78, "feminino", 1800F));

        Jogador jogador[] = new Jogador[2];
        jogador[0] = new Jogador("Neyma", 29, "masculino", "Ala", "Real Madruga");

        Visitante visitante = new Visitante("gui", 18, "masc");

        for(Aluno a : aluno){
            System.out.println(a.getNome());
        }
    }
}
