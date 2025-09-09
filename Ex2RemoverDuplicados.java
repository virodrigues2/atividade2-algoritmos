package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2RemoverDuplicados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de contatos original
        ArrayList<String> contatos = new ArrayList<>();

        System.out.println("=== Sistema de Contatos - Remoção de Duplicados ===");
        System.out.println("Digite os nomes dos contatos (digite 'fim' para encerrar):");

        // Entrada de dados do usuário
        while (true) {
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break; // Sai do loop quando digitar "fim"
            }
            contatos.add(nome);
        }

        // Mostrando a lista original (com possíveis duplicados)
        System.out.println("\n📋 Lista original de contatos:");
        for (String c : contatos) {
            System.out.println("- " + c);
        }

        // Criando nova lista sem duplicados
        ArrayList<String> contatosUnicos = new ArrayList<>();
        for (String c : contatos) {
            if (!contatosUnicos.contains(c)) { // só adiciona se ainda não estiver na lista
                contatosUnicos.add(c);
            }
        }

        // Mostrando a lista final sem duplicados
        System.out.println("\n✅ Lista de contatos sem duplicados:");
        for (String c : contatosUnicos) {
            System.out.println("- " + c);
        }

        sc.close();
    }
}
