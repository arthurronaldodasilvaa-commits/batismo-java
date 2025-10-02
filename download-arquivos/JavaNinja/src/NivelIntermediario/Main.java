package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // OBJ 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";
        naruto.ModoSabioAtivado();

        // OBJ 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.SharinganAtivado();

        // OBJ 3
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "Aldeia da Folha";
        sakura.AtivarCura();

        // OBJ 4
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 16;
        hinata.aldeia = "Aldeia da Folha";
        hinata.ByakuganAtivado();

    }
}
