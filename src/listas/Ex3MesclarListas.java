import java.util.ArrayList;
import java.util.Scanner;

public class Ex3MesclarListas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando as duas listas
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        System.out.println("=== MESCLAR LISTAS ===");

        // Entrada da primeira lista
        System.out.print("Quantos elementos na primeira lista? ");
        int n1 = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha
        for (int i = 0; i < n1; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            lista1.add(sc.nextLine());
        }

        // Entrada da segunda lista
        System.out.print("\nQuantos elementos na segunda lista? ");
        int n2 = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha
        for (int i = 0; i < n2; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            lista2.add(sc.nextLine());
        }

        // Criando a lista mesclada
        ArrayList<String> listaMesclada = new ArrayList<>(lista1);
        listaMesclada.addAll(lista2);

        // Exibindo resultado
        System.out.println("\n📌 Lista mesclada: " + listaMesclada);

        sc.close();
    }
}
