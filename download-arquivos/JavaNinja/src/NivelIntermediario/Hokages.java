package NivelIntermediario;

public class Hokages extends Ninja {

    String nome;
    int idade;
    boolean ativo;

    // All args constructor
    public Hokages(String nome, int idade, boolean ativo, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.ativo = ativo;
        this.aldeia = aldeia;
    }

    // No args constructor
    public Hokages() {
    }
}
