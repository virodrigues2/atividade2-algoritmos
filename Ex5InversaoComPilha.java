import java.util.ArrayList;
import java.util.Stack;

public class Ex5InversaoComPilha {
    public static void main(String[] args) {
        // Criando uma lista de produtos
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Notebook");
        produtos.add("Mouse");
        produtos.add("Teclado");
        produtos.add("Monitor");
        produtos.add("Impressora");

        System.out.println("Lista original: " + produtos);

        // Chamando o método que inverte com pilha
        ArrayList<String> invertida = inverterComPilha(produtos);

        System.out.println("Lista invertida: " + invertida);
    }

    // Método que usa uma pilha para inverter a lista
    public static ArrayList<String> inverterComPilha(ArrayList<String> lista) {
        Stack<String> pilha = new Stack<>();

        // Passo 1: empilhar todos os elementos
        for (String item : lista) {
            pilha.push(item);
        }

        // Passo 2: desempilhar e colocar em uma nova lista
        ArrayList<String> invertida = new ArrayList<>();
        while (!pilha.isEmpty()) {
            invertida.add(pilha.pop());
        }

        return invertida;
    }
}

// ===============================
// Exemplos de saída:
// Lista original: [Notebook, Mouse, Teclado, Monitor, Impressora]
// Lista invertida: [Impressora, Monitor, Teclado, Mouse, Notebook]
