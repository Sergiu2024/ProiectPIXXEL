package tema2;
//6. Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
// Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7,
// sa se opreasca iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.

public class Exercitiul6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Parcurgerea array-ului:");
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                continue;
            } else if (i == 7) {
                break; // Oprește iterarea la indexul 7
            } else {
                System.out.println("Index valid: " + i);
            }
        }
    }
}
