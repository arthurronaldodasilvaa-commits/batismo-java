package NivelIntermediario;

public class Uchiha extends Ninja {

    // Sharingan ativado, metodo público
    public void SharinganAtivado() {
        System.out.println("O meu nome é " + this.nome + ". Meu Sharingan ativou! Eu sou Uchiha!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu Ataque Uchiha, um ataque de fogo!");
    }

}
