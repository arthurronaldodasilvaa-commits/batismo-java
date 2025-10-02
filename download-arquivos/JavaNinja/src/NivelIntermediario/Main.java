package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";

        // Criar o ninja Sasuke - Sasuke é um OBJETO
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

        // Aplicando métodos aos meus objetos
        sasuke.SharinganAtivado();

        String chamandoMetodo = sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = sasuke.AnosParaSeTornarHokage(50);
        System.out.println("Você tem " + sasuke.idade + " anos então falta no mínimo "
                + quantoTempoFalta +
                " anos para você se tornar hokage");

        // Criar o ninja Sakura - Sakura é um OBJETO
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "Aldeia da Folha";

    }
}
