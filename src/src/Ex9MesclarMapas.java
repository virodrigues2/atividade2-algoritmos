import java.util.HashMap;
import java.util.Map;

public class Ex9MesclarMapas {
    public static void main(String[] args) {
        // Inventário 1
        Map<String, Integer> inventario1 = new HashMap<>();
        inventario1.put("Notebook", 5);
        inventario1.put("Mouse", 10);
        inventario1.put("Teclado", 7);

        // Inventário 2
        Map<String, Integer> inventario2 = new HashMap<>();
        inventario2.put("Mouse", 3);
        inventario2.put("Monitor", 4);
        inventario2.put("Notebook", 2);

        System.out.println("Inventário 1: " + inventario1);
        System.out.println("Inventário 2: " + inventario2);

        // Mesclando inventários
        Map<String, Integer> inventarioFinal = mesclarInventarios(inventario1, inventario2);

        System.out.println("\n📦 Inventário final: " + inventarioFinal);
    }

    // Método que mescla dois mapas de produtos
    public static Map<String, Integer> mesclarInventarios(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {
        Map<String, Integer> resultado = new HashMap<>(mapa1);

        for (Map.Entry<String, Integer> entrada : mapa2.entrySet()) {
            String produto = entrada.getKey();
            Integer quantidade = entrada.getValue();

            // Se o produto já existir, soma as quantidades
            resultado.put(produto, resultado.getOrDefault(produto, 0) + quantidade);
        }

        return resultado;
    }
}

// ===============================
// Exemplos de saída:
// Inventário 1: {Notebook=5, Mouse=10, Teclado=7}
// Inventário 2: {Mouse=3, Monitor=4, Notebook=2}
// Inventário final: {Notebook=7, Mouse=13, Teclado=7, Monitor=4}
