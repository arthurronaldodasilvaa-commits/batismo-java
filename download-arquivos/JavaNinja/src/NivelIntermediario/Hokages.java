package NivelIntermediario;

public abstract class Hokages extends Ninja {

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

    public abstract void sabedoriaHokage();

}
