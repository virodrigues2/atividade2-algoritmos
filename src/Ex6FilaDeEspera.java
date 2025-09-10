import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex6FilaDeEspera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando a fila de pacientes
        Queue<String> filaPacientes = new LinkedList<>();

        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE FILA DE ESPERA ===");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Atender paciente");
            System.out.println("3 - Mostrar fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do paciente: ");
                    String nome = sc.nextLine();
                    filaPacientes.add(nome);
                    System.out.println("✅ " + nome + " entrou na fila.");
                    break;

                case 2:
                    if (filaPacientes.isEmpty()) {
                        System.out.println("⚠️ Nenhum paciente na fila.");
                    } else {
                        String atendido = filaPacientes.poll();
                        System.out.println("👨‍⚕️ Atendendo: " + atendido);
                    }
                    break;

                case 3:
                    System.out.println("📋 Fila atual: " + filaPacientes);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("❌ Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

// ===============================
// Exemplos de uso:
// 1 - Adicionar "Ana" → Fila: [Ana]
// 1 - Adicionar "Carlos" → Fila: [Ana, Carlos]
// 3 - Mostrar fila → [Ana, Carlos]
// 2 - Atender → "Ana" sai → Fila: [Carlos]

