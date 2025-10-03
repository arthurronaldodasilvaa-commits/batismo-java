package Desafios.DesafioQuatro;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public NinjaBasico() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("Tipo de Habilidade: " + this.tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade: " + this.habilidade + " do tipo " + this.tipoHabilidade + " executada.");
    }

}
