package tema2;
//2. Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind structura
// switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere,
// si afisati rezultatul pe ecran:-‘a’: adaugare-‘s’: scadere-‘i’: inmultire-‘p’: impartire-‘m’:
// modulDaca nu s-a introdus un caracter valid, afisati un mesaj de eroare.

import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un caracter (a, s, i, p, m): ");
        char caracter = scanner.next().charAt(0);
        System.out.print("Introduceți primul număr: ");
        double numar1 = scanner.nextDouble();
        System.out.print("Introduceți al doilea număr: ");
        double numar2 = scanner.nextDouble();

        double rezultat;
        switch (caracter) {
            case 'a':
                rezultat = numar1 + numar2;
                System.out.println("Rezultatul adunării este: " + rezultat);
                break;
            case 's':
                rezultat = numar1 - numar2;
                System.out.println("Rezultatul scăderii este: " + rezultat);
                break;
            case 'i':
                rezultat = numar1 * numar2;
                System.out.println("Rezultatul înmulțirii este: " + rezultat);
                break;
            case 'p':
                if (numar2 != 0) {
                    rezultat = numar1 / numar2;
                    System.out.println("Rezultatul împărțirii este: " + rezultat);
                } else {
                    System.out.println("Nu se poate împărți la zero.");
                }
                break;
            case 'm':
                if (numar2 != 0) {
                    rezultat = numar1 % numar2;
                    System.out.println("Rezultatul modulului este: " + rezultat);
                } else {
                    System.out.println("Nu se poate calcula modulul pentru împărțirea la zero.");
                }
                break;
            default:
                System.out.println("Caracterul introdus nu este valid.");
        }
    }
}
