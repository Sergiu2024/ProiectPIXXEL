package tema2;
//3. Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
// Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.

public class Exercitiul3 {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };
        System.out.println("Primele și ultimele elemente din fiecare dimensiune:");
        for (int i = 0; i < array2D.length; i++) {
            System.out.println("Dimensiunea " + i + ":");
            System.out.println("Primul element: " + array2D[i][0]);
            System.out.println("Ultimul element: " + array2D[i][array2D[i].length - 1]);
            System.out.println();
        }
    }
}
