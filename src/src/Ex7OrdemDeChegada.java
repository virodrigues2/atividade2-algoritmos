import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex7OrdemDeChegada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando a fila de clientes
        Queue<String> filaClientes = new LinkedList<>();

        System.out.println("=== ORDEM DE CHEGADA NA LOJA ===");
        System.out.println("Digite os nomes dos clientes (digite 'fim' para encerrar):");

        String nome;
        while (true) {
            System.out.print("Cliente: ");
            nome = sc.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            filaClientes.add(nome);
        }

        // Mostrando ordem de saída (atendimento)
        System.out.println("\n📋 Ordem de atendimento:");
        while (!filaClientes.isEmpty()) {
            System.out.println("➡️ " + filaClientes.poll());
        }

        sc.close();
    }
}

// ===============================
// Exemplos de uso:
// Entrada: João, Maria, Pedro, fim
// Saída:
// Ordem de atendimento:
// ➡️ João
// ➡️ Maria
// ➡️ Pedro
