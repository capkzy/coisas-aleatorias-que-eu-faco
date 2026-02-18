package Java;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();

        inventario.add("Espada");          // adiciona item
        inventario.add("Pocao");
        inventario.add("Escudadadad");

        System.out.println(inventario);    // [Espada, Pocao, Escudo]
        System.out.println(inventario.get(1)); // Pocao (pega pelo índice)

        inventario.remove("Pocao");        // remove por nome
        inventario.set(0, "Espada de Ferro"); // troca item da posição 0

        System.out.println("Tamanho: " + inventario.size()); // quantidade
        System.out.println("Tem escudo? " + inventario.contains("Escudo")); // true
        System.out.println(inventario);    // [Espada de Ferro, Escudo]
    }
}
