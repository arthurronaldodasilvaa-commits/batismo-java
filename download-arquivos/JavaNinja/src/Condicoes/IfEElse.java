package Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        * If e Else - Condições
        * else if
        * Objetivo: Passar o ninja de nível de acordo com o número de missões
        * */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        int idade = 16;
        String rank;
        boolean hokage = false;
        short  numeroDeMissoes = 20;

        // se(condicao) {faça isso}
        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunin");
        } else if (numeroDeMissoes >= 20){
            System.out.println("Ranking: Jounin");
        } else {
            System.out.println("Rank: Genin");
        }
    }
}
