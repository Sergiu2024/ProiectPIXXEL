package tema2;
//5. Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for,
// si daca un element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai mare
// decat 5, afisati mesajul “Element peste 5”
public class Exercitiul5 {
    public static void main(String[] args) {
        double[] arrayDouble = {2.4, 4.5, 5.9, 7.5, 9.3};


        System.out.println("Elementele din array:");
        for (int i = 0; i < arrayDouble.length; i++) {
            if (arrayDouble[i] == 4.5) {
                System.out.println("Elementul " + arrayDouble[i] + " este egal cu 4.5");
            }
            if (arrayDouble[i] > 5) {
                System.out.println("Elementul " + arrayDouble[i] + " este mai mare decât 5");
            }
        }
    }
}
