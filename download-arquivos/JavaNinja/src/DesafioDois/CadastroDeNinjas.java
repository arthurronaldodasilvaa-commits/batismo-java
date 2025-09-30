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
        short h = 0;
        /**/

        /* BODY */
        while (s == false){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = t.nextShort();
            switch (escolha) {
                case 1:
                    System.out.println("\nCadastrando ninja...");
                    System.out.print("Qual o nome do ninja: ");
                    t.nextLine();
                    nome = t.nextLine();
                    ninjas[ninja] = nome;
                    ninja++;
                    System.out.println("\nNinja cadastrado.\n");
                    break;
                case 2:
                    System.out.println("\nEstes são os ninjas registrados:");
                    for (String a : ninjas) {
                        h++;
                        if (h == 1 && a == null) {
                            System.out.println("Nenhum ninja cadastrado...");
                        }
                        if (a != null) {
                            System.out.println("O " + h + "° ninja da lista é " + a);
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
