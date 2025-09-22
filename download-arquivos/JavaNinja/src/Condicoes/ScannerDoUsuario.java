package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
        * Scanner = É um jeito de trazer o usuário dentro da aplicação
        * Obetivo: O usuario vai criar um ninja e vamos validar os dados
        * */

        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.print("Digite o nome do(a) ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do(a) ninja é " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("\nDigite a idade do(a) ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do(a) ninja é " + idadeDoNinja + " anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18){
            System.out.println("\nEste(a) ninja já é maior de idade, e pode ir para missões fora da aldeia!");
        } else {
            System.out.println("\nEste(a) ninja é muito novo(a) ainda, precisa treinar mais para sair da vila!");
        }

        // Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
