package Desafios.DesafioQuatro;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;
    TipoHabilidade tipoEspecialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade, TipoHabilidade tipoEspecialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
        this.especialidade = especialidade;
        this.tipoEspecialidade = tipoEspecialidade;
    }

    public NinjaAvancado() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Tipo de Habilidade: " + this.tipoHabilidade);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Tipo da Especialidade: " + this.tipoEspecialidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade: " + this.habilidade + " do tipo " + this.tipoHabilidade + " executada.");
    }

    public void executarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + this.especialidade + " do tipo " + this.tipoEspecialidade + " executada.");
    }

}
