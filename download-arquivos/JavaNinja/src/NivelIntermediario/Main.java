package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // OBJ Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        sasuke.sharinganAtivado();

        // OBJ Hatake
        System.out.println();
        Hatake kakashi = new Hatake("Kakashi Hatake", "Aldeia da Folha", 48);
        kakashi.BoasVindas();
        kakashi.sharinganAtivado();
        kakashi.bemVindoAAnbu();
        kakashi.hokageAtivo();

    }
}
