package Desafios.DesafioTres;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando um ninja comum
        Ninja naruto = new Ninja("Naruto Uzumaki", 17, "Proteger a Vila", "A", "Em andamento");

        // Criando um ninja Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 17, "Capturar Orochimaru", "S", "Concluída", "Sharingan");

        System.out.println("=== Ninja Comum ===");
        naruto.mostrarInformacoes();

        System.out.println("\n=== Ninja Uchiha ===");
        sasuke.mostrarInformacoes();

        System.out.println("\n=== Habilidade Especial do Uchiha ===");
        sasuke.mostrarHabilidadeEspecial();
    }
}
