package DesafioDois;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {

        /* Array de ninjas (max 10) */
        String[] ninjas = new String[10];
        short ninja = 0;
        /**/

        /* Input do usuário */
        Scanner t = new Scanner(System.in);
        short escolha;
        String nome;
        /**/

        /* Outras Variavéis */
        boolean s = false;
        /**/

        /* BODY */
        while (!s){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = t.nextShort();
            switch (escolha) {
                case 1:
                    if (ninja >= 10) { // ← Verificar limite
                        System.out.println("Limite de 10 ninjas atingido!");
                        break;
                    }
                    System.out.println("\nCadastrando ninja...");
                    System.out.print("Qual o nome do ninja: ");
                    t.nextLine();
                    nome = t.nextLine();
                    ninjas[ninja] = nome;
                    ninja++;
                    System.out.println("\nNinja cadastrado.");
                    break;

                case 2:
                    System.out.println("\nEstes são os ninjas registrados:");
                    if (ninja == 0) {
                        System.out.println("Nenhum ninja cadastrado...");
                    } else {
                        for (int i = 0; i < ninja; i++) {
                            System.out.println("O(a) " + (i+1) + "° ninja da lista é " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nSaindo do sistema...");
                    s = true;
                    break;
                default:
                    System.out.println("\nVocê não digitou uma escolha válida!");
            }
        }
        /**/

        /**/
        t.close();
        /**/

    }
}
