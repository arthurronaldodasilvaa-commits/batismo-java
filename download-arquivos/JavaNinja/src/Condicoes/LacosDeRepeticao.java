package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição: Vão repetir infinitamente ou até atingir o parametro desejado
        * While, FOR
        * */

        // While
        // While (condição) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaxClones = 10;

        System.out.println("***Whith while! ---------------------");
        while (numeroMaxClones > numeroDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras. Clone: " + numeroDeClones);
        }

        /**/
        System.out.println("\n***\n");
        numeroDeClones = 0;
        /**/

        // For

        System.out.println("***Whith for! -----------------------");
        for (int i = 1; i <= numeroMaxClones; i++) {
            numeroDeClones = i;
            System.out.println("O naruto fez um clone das sombras. Clone: " + numeroDeClones);
        }

    }
}
