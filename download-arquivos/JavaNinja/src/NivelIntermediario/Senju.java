package NivelIntermediario;

public class Senju extends Hokages {

    public Senju(String nome, int idade, boolean ativo, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.ativo = ativo;
        this.aldeia = aldeia;
    }

    public Senju() {
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu Ataque Senju, um ataque de madeira!");
    }

    @Override
    public void sabedoriaHokage() {
        System.out.println("Você ganhou sabedoria Hokage!");
    }
}
