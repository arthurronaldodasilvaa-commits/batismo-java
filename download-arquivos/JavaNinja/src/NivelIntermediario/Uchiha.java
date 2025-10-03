package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // Esse metodo vem direto da interface!
    @Override
    public void sharinganAtivado() {
        System.out.println(this.nome + ": Ativou o Sharingan");
    }
}
