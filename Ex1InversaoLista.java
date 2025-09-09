package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1InversaoLista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando a lista de tarefas
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println("=== Sistema de Tarefas - Inversão de Lista ===");
        System.out.println("Digite suas tarefas do dia (digite 'fim' para encerrar):");

        // Entrada de dados do usuário
        while (true) {
            String tarefa = sc.nextLine();

            if (tarefa.equalsIgnoreCase("fim")) {
                break; // Sai do loop quando digitar "fim"
            }
            tarefas.add(tarefa);
        }

        // Mostrando a lista original
        System.out.println("\n📋 Lista original de tarefas:");
        for (String t : tarefas) {
            System.out.println("- " + t);
        }

        // Invertendo manualmente (sem usar métodos prontos da linguagem)
        ArrayList<String> invertida = new ArrayList<>();
        for (int i = tarefas.size() - 1; i >= 0; i--) {
            invertida.add(tarefas.get(i));
        }

        // Mostrando a lista invertida
        System.out.println("\n🔄 Lista invertida de tarefas:");
        for (String t : invertida) {
            System.out.println("- " + t);
        }

        sc.close();
    }
}
