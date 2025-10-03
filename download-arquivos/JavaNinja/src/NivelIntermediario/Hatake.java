package NivelIntermediario;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public Hatake() {
        super();
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void BoasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(this.nome + ": Ativou o Sharingan");
    }

    @Override
    public void bemVindoAAnbu() {
        System.out.println(nome + ": Eu sou um ninja de elite da Anbu");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um Hokage!");
    }
}
