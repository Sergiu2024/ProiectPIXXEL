package tema1;
//Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura,
//le stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
import java.util.Scanner;

public class Exercitiul6 {
    public static void citesteSiAfiseazaNumere() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți primul număr:");

        int numar1 = scanner.nextInt();

        System.out.println("Introduceți al doilea număr:");

        int numar2 = scanner.nextInt();

        System.out.println("Primul număr introdus: " + numar1);
        System.out.println("Al doilea număr introdus: " + numar2);

        scanner.close();
    }

    public static void main(String[] args) {
        // Apelăm metoda citesteSiAfiseazaNumere pentru a citi și afișa numerele
        citesteSiAfiseazaNumere();
    }
}
