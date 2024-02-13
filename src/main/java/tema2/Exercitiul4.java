package tema2;
//4. Definiti un array de char-uri. Iterati array-ul folosind structura for, si
// afisati pe ecran cate al doilea caracter din sir.

public class Exercitiul4 {
    public static void main(String[] args) {
        char[] arrayCaractere = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        System.out.println("Al doilea caracter din fiecare șir:");
        for (int i = 1; i < arrayCaractere.length; i += 2) {
            System.out.println(arrayCaractere[i]);
        }
    }
}
