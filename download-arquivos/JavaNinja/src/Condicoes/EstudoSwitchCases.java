package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * Switch Cases: Que server para gerar casos específicos
        * Objetivo: Pedir pro usuario escolher entre os Ninjas
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sasuke Uchiha");
        System.out.println("3. Sakura Haruno");

        // Pedir para o usuário escolher alguma
        System.out.print("Escolha: ");
        int escolha = scanner.nextInt();

        // Reacao ao escoler um personagem
        switch (escolha) {
            case 1:
                System.out.print("\nO usuário escolheu o Naruto Uzumaki, o sérimo hokage");
                break;
            case 2:
                System.out.print("\nO usuário escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.print("\nO usuário escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("\nVocê não digitou uma resposta que não é válida, tente de novo!");
        }

        // Fechar a caixa
        scanner.close();
    }
}
