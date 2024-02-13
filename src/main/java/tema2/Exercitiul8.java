package tema2;
//8. Definiti un array si o lista. Determinati daca ele sunt goale sau nu.

public class Exercitiul8 {
    public static void main(String[] args) {
        int[] array = new int[5];

        if (array.length == 0) {
            System.out.println("Array-ul este gol.");
        } else {
            System.out.println("Array-ul nu este gol.");
        }
    }
}
