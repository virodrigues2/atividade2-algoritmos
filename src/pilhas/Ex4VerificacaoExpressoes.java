import java.util.Scanner;
import java.util.Stack;

public class Ex4VerificacaoExpressoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== VERIFICADOR DE EXPRESSÕES ===");
        System.out.print("Digite uma expressão matemática: ");
        String expressao = sc.nextLine();

        if (verificarExpressao(expressao)) {
            System.out.println("✅ A expressão está correta (parênteses balanceados).");
        } else {
            System.out.println("❌ A expressão está incorreta (parênteses não balanceados).");
        }

        sc.close();
    }

    // Método para verificar se a expressão está balanceada
    public static boolean verificarExpressao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c); // abre parêntese → adiciona na pilha
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; // fecha sem ter aberto
                }
                pilha.pop(); // remove um abre parêntese correspondente
            }
        }

        return pilha.isEmpty(); // se a pilha ficou vazia, está balanceado
    }
}

// ===============================
// Exemplos de teste:
// Entrada: (2+3)*(5-1)   → Saída: correta
// Entrada: ((2+3)*(5-1)  → Saída: incorreta
// Entrada: (1+(2*3))-4)  → Saída: incorreta
// Entrada: ((1+2)*(3+4)) → Saída: correta

