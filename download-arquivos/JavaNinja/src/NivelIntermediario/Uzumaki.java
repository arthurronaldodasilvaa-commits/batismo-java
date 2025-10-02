package NivelIntermediario;

public class Uzumaki extends Ninja{

    public void ModoSabioAtivado() {
        System.out.println("O meu nome é " + this.nome + ". Eu ativei o modo sábio!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu Ataque Uzumaki, um ataque de vento!");
    }

}
