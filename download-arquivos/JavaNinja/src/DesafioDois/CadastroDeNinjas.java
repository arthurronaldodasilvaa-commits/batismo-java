package DesafioDois;

import java.util.Scanner;

/**
 * Sistema de Cadastro de Ninjas
 *
 * Permite cadastrar e listar até 10 ninjas através de um menu interativo.
 * @Autor: Arthur Ronaldo da Silva
 * @Data: 30/09/2025
 */
public class CadastroDeNinjas {
    public static void main(String[] args) {

        // Array para armazenar os nomes dos ninjas (capacidade máxima: 10)
        String[] ninjas = new String[10];
        // Contador de ninjas cadastrados
        int ninja = 0;

        // Scanner para entrada de dados do usuário
        Scanner t = new Scanner(System.in);
        // Variáveis para armazenar a escolha do menu e nome do ninja
        short escolha;
        String nome;

        // Flag para controle de execução do sistema
        boolean s = false;

        // LOOP PRINCIPAL - Mantém o sistema rodando até o usuário escolher sair
        while (!s){
            // Exibe o menu de opções
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção escolhida pelo usuário
            escolha = t.nextShort();

            // Processa a opção selecionada
            switch (escolha) {
                case 1: // CADASTRAR NOVO NINJA
                    // Verifica se atingiu o limite máximo
                    if (ninja >= 10) {
                        System.out.println("Limite de 10 ninjas atingido!");
                        break;
                    }
                    System.out.println("\nCadastrando ninja...");
                    System.out.print("Qual o nome do ninja: ");
                    t.nextLine(); // Limpa o buffer do teclado
                    nome = t.nextLine(); // Lê o nome do ninja

                    // Armazena o ninja no array e incrementa o contador
                    ninjas[ninja] = nome;
                    ninja++;
                    System.out.println("\nNinja cadastrado.");
                    break;

                case 2: // LISTAR NINJAS CADASTRADOS
                    System.out.println("\nEstes são os ninjas registrados:");
                    // Verifica se há ninjas cadastrados
                    if (ninja == 0) {
                        System.out.println("Nenhum ninja cadastrado...");
                    } else {
                        // Lista todos os ninjas cadastrados
                        for (int i = 0; i < ninja; i++) {
                            System.out.println("O(a) " + (i+1) + "° ninja da lista é " + ninjas[i]);
                        }
                    }
                    break;

                case 3: // SAIR DO SISTEMA
                    System.out.print("\nSaindo do sistema...");
                    s = true; // Altera a flag para encerrar o loop
                    break;

                default: // OPÇÃO INVÁLIDA
                    System.out.println("\nVocê não digitou uma escolha válida!");
            }
        }

        // Fecha o scanner para liberar recursos
        t.close();
    }
}