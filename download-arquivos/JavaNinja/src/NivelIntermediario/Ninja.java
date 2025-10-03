package NivelIntermediario;

public abstract class Ninja {

    String nome;
    int idade;
    String aldeia;

    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu ataque especial");
    }

}
