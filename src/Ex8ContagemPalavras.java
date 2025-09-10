import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8ContagemPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONTADOR DE PALAVRAS ===");
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // Chamando método que faz a contagem
        Map<String, Integer> contagem = contarPalavras(frase);

        // Exibindo resultado
        System.out.println("\n📊 Frequência das palavras:");
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        sc.close();
    }

    // Método que conta as palavras usando HashMap
    public static Map<String, Integer> contarPalavras(String frase) {
        Map<String, Integer> mapa = new HashMap<>();

        // Quebrar a frase em palavras (separar por espaço)
        String[] palavras = frase.toLowerCase().split(" ");

        for (String palavra : palavras) {
            if (mapa.containsKey(palavra)) {
                mapa.put(palavra, mapa.get(palavra) + 1); // já existe → soma
            } else {
                mapa.put(palavra, 1); // primeira vez
            }
        }

        return mapa;
    }
}

// ===============================
// Exemplos de teste:
// Entrada: "hoje é um bom dia hoje"
// Saída:
// hoje → 2
// é → 1
// um → 1
// bom → 1
// dia → 1
