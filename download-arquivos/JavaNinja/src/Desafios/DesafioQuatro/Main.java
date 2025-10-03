package Desafios.DesafioQuatro;

public class Main {
    public static void main(String[] args) {

        /**/
        NinjaBasico sakura = new NinjaBasico("Sakura Haruno", 17, "Cura Simples", TipoHabilidade.NINJUTSU);
        sakura.mostrarInformacoes();
        System.out.println();
        sakura.executarHabilidade();
        /**/

        System.out.println();
        System.out.println();

        /**/
        NinjaAvancado naruto = new NinjaAvancado("Naruto Uzumaki", 18, "Rasengan", "Jutsu Clone das Sombras", TipoHabilidade.NINJUTSU, TipoHabilidade.NINJUTSU);
        naruto.mostrarInformacoes();
        System.out.println();
        naruto.executarHabilidade();
        naruto.executarHabilidadeEspecial();
        /**/

        System.out.println();
        System.out.println();

        /**/
        NinjaAvancado madara = new NinjaAvancado("Madara Uchiha", 39, "Amaterasu", "Tsukuyomi Infinito", TipoHabilidade.NINJUTSU, TipoHabilidade.GENJUTSU);
        madara.mostrarInformacoes();
        System.out.println();
        madara.executarHabilidade();
        madara.executarHabilidadeEspecial();
        /**/

    }
}
