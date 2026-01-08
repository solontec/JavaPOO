package Aula07RelacionamentoDeClasses.model;

public class Luta {
    // agregação aula;

    // desafiado é um objeto de Lutador


    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    // cada if protege uma regra
    public void marcarLuta(Lutador l1, Lutador l2){

        if(!l1.getSexo().equals(l2.getSexo())){
            throw new IllegalArgumentException("Homem espancou mulher, HI HITLER");
        }
        if(l1 == null || l2 == null){
            throw new IllegalArgumentException("Lutador não pode ser nulo");
        }

        if(l1 == l2){
            throw new IllegalArgumentException("Precisa de lutadores diferentes");
        }

        // se for diferente ele n pode lutar obviamente
        if(!l1.getCategory().equals(l2.getCategory())){
            throw new IllegalArgumentException("Categorias diferentes, não pode");
        }

        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
        System.out.println("Luta marcada");

    }
    public void lutar(){
        // state usado por conta do estado do boolean
        if(!aprovada){
            throw new IllegalStateException("A luta n foi aprovada!");
        }

        this.desafiado.present();
        this.desafiante.present();

        int vencedor = (int) (Math.random() * 5);


        switch (vencedor){
            case 1:
                System.out.println(" Lutador " + this.getDesafiado().getName() + " ganhou por pontos ");
                this.desafiado.winFight();
                this.desafiante.loseFight();

                System.out.println(vencedor);
                break;

            case 2:
                System.out.println(" Lutador " + this.getDesafiante().getName() +" ganhou por pontos ");
                this.desafiante.winFight();
                this.desafiado.loseFight();

                System.out.println(vencedor);
                break;

            case 3:
                System.out.println(" Lutador " + this.getDesafiado().getName() + " ganhou por nocaute ");
                this.desafiado.winFight();
                this.desafiante.loseFight();

                System.out.println(vencedor);
                break;

            case 4:
                System.out.println(" Lutador" + this.getDesafiante().getName() + " ganhou por nocaute ");
                this.desafiante.winFight();
                this.desafiado.loseFight();

                System.out.println(vencedor);
                break;

            case 0:
                System.out.println(" Empate! ");
                this.desafiado.drawFight();
                this.desafiante.drawFight();

                System.out.println(vencedor);
                break;

            default:
                throw new RuntimeException("Erro");
        }

    }
}

