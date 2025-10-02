package NivelIntermediario;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    // Criar um metodo publico
    /*
    * O metodo VOID nao retorna valor nenhum!
    * */
    public void SharinganAtivado() {
        System.out.println("O Sharingan Ativou!");
    }

    /*
    * Metodo String vai ter que retornar uma string
    * */
    public String EuSouUmNinja(){
        return "Oi, Eu sou um ninja! E meu nome é " + this.nome;
    }

    /*
    * Metodo INT vai ter que retornar um int
    * */
    public int AnosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}
